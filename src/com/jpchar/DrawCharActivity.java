package com.jpchar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.jpchar.structures.KanaSyllabary;

public class DrawCharActivity extends Activity implements OnClickListener {
	
	private TextView type, name;
	private ImageView clean, edit, next;
	private String extra;
	private int number;
	private float smallBrush, mediumBrush, largeBrush;
	private DrawCharEventView drawView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// set window for this Activity to full screen mode
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
				
		setContentView(R.layout.draw);
		
		drawView = (DrawCharEventView)findViewById(R.id.drawView);
		
		type = (TextView)findViewById(R.id.typeText);
		name = (TextView)findViewById(R.id.nameText);
		clean = (ImageView)findViewById(R.id.cleanImage);
		clean.setOnClickListener(this);
		edit = (ImageView)findViewById(R.id.editImage);
		edit.setOnClickListener(this);
		next = (ImageView)findViewById(R.id.nextImage);
		next.setOnClickListener(this);
		
		smallBrush = getResources().getInteger(R.integer.small_size);
		mediumBrush = getResources().getInteger(R.integer.medium_size);
		largeBrush = getResources().getInteger(R.integer.large_size);
		
		drawView.setBrushSize(mediumBrush);
	}	
	

	@Override
	protected void onResume() {
		super.onResume();
		Bundle extras = getIntent().getExtras();
		extra = extras.getString("type");
		number = extras.getInt("counter");
		
		type.setText(getResources().getIdentifier(extra, "string", "com.jpchar"));
		
		if (extra.contains("hiragana")) {
			name.setText(KanaSyllabary.syllabaryHiragana.get(number).getName());
		} else if (extra.contains("katakana")) {
			name.setText(KanaSyllabary.syllabaryKatakana.get(number).getName());
		} else {
			name.setText(KanaSyllabary.kanji.get(number).getName());
		}
	}



	@Override
	public void onClick(View v) {
		switch(v.getId()) {
			case R.id.nextImage:
				File filename = null, filename2 = null;
				
				//Save the drawn image when finished
				if(extra.contains("hiragana")) {
					filename = new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + 
							"/" + extra + "/" + extra.substring(0, 1) + KanaSyllabary.syllabaryHiragana.get(number).getCode() + ".png");
				} else if(extra.contains("katakana")) {
					filename = new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + 
							"/" + extra + "/" + extra.substring(0, 1) + KanaSyllabary.syllabaryKatakana.get(number).getCode() + ".png");
				} else {
					filename = new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + 
							"/" + extra + "/" + KanaSyllabary.kanji.get(number).getCode() + ".png");
				}
				
				try {
				       FileOutputStream out = new FileOutputStream(filename);
				       drawView.getBitmap().compress(Bitmap.CompressFormat.PNG, 90, out);
				       out.close();
				} catch (Exception e) {
				       e.printStackTrace();
				}
				
				//Save the compressed data about image pixels -> neural network input
				filename = new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + 
						"/" + extra + "/" + extra + ".dat");
				filename2 = new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + 
						"/" + extra + ".dat");
				
				try {
				       //FileOutputStream out = new FileOutputStream(filename);
				       Bitmap bmp = drawView.getBitmap(), sbmp = null;
				       int x = -1, y = -1, firstX = Integer.MAX_VALUE, firstY = Integer.MAX_VALUE, lastX = -1, lastY = -1, diffX, diffY;
				       
				       //find the used boundaries to cut useless, empty pixels
				       bmp = Bitmap.createScaledBitmap(bmp, bmp.getWidth()/2, bmp.getHeight()/2, false);
				       while (++x < bmp.getWidth()) {
				    	   y = -1;
				    	   while (++y < bmp.getHeight()) {
				    		   if (bmp.getPixel(x, y) != 0) {
				    			   if (firstX > x) {
				    				   firstX = x;
				    			   }
				    			   if (firstY > y) {
				    				   firstY = y;
				    			   }
				    			   if (lastX < x) {
				    				   lastX = x;
				    			   }
				    			   if (lastY < y) {
				    				   lastY = y;
				    			   }
				    		   } 
				    	   }				    	   
				       }
				       diffX = lastX - firstX;
				       diffY = lastY - firstY;
				       bmp = Bitmap.createBitmap(bmp, firstX, firstY, diffX, diffY);
				       sbmp = Bitmap.createScaledBitmap(bmp, 30, 30, false);
				       
				       //create resized binary matrix
				       String data = "";
				       y = -1;
				       while (++y < sbmp.getHeight()) {
				    	   x = -1;
				    	   while (++x < sbmp.getWidth()) {
				    		   if (sbmp.getPixel(x, y) == Color.BLACK) {
				    			   data += "1 ";
				    		   } else {
				    			   data += "0 ";
				    		   }
				    	   }
				       }
			    	   //data += "\n";
				       //out.write(data.getBytes());
				       //out.close();
			    	   FileWriter fileWriter2 = new FileWriter(filename2, true);
			    	   FileWriter fileWriter = null;
			    	   if (number == 0) {
			    		   fileWriter = new FileWriter(filename, false);
			    	   } else {
			    		   fileWriter = new FileWriter(filename, true);
			    	   }
				       fileWriter.write(data + "\n");
				       fileWriter2.write(data);
				       fileWriter2.write("" + (number+1) + "\n");
				       fileWriter2.close();
				       fileWriter.close();
				} catch (Exception e) {
				       e.printStackTrace();
				}
				
				if((extra.contains("ana") && (number == this.getResources().getInteger(R.integer.kana_quantity) - 1)) || 
						(extra.contains("kanji") && (number == this.getResources().getInteger(R.integer.kanji_quantity) - 1))) {
					File directory = new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + 
								"/" + extra + "/");
					try {
						Calendar now = Calendar.getInstance();
						zipDirectory(directory, new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + 
								"/" + extra + "_" + now.get(Calendar.YEAR) + "" + now.get(Calendar.MONTH) + "" + now.get(Calendar.DAY_OF_MONTH) + "" +
								now.get(Calendar.HOUR_OF_DAY) + "" + now.get(Calendar.MINUTE) + ".zip"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					close();
				}
				finish();
				break;
				
			case R.id.editImage:
				final Dialog brushDialog = new Dialog(this);
				brushDialog.setTitle("Brush size:");
				brushDialog.setContentView(R.layout.brush);
				ImageButton smallBtn = (ImageButton)brushDialog.findViewById(R.id.small_brush);
				smallBtn.setOnClickListener(new OnClickListener(){
				    @Override
				    public void onClick(View v) {
				        drawView.setBrushSize(smallBrush);
				        drawView.setLastBrushSize(smallBrush);
				        brushDialog.dismiss();
				    }
				});
				ImageButton mediumBtn = (ImageButton)brushDialog.findViewById(R.id.medium_brush);
				mediumBtn.setOnClickListener(new OnClickListener(){
				    @Override
				    public void onClick(View v) {
				        drawView.setBrushSize(mediumBrush);
				        drawView.setLastBrushSize(mediumBrush);
				        brushDialog.dismiss();
				    }
				});
				ImageButton largeBtn = (ImageButton)brushDialog.findViewById(R.id.large_brush);
				largeBtn.setOnClickListener(new OnClickListener(){
				    @Override
				    public void onClick(View v) {
				        drawView.setBrushSize(largeBrush);
				        drawView.setLastBrushSize(largeBrush);
				        brushDialog.dismiss();
				    }
				});
				brushDialog.show();
				break;
			case R.id.cleanImage:
				AlertDialog.Builder newDialog = new AlertDialog.Builder(this);
				newDialog.setTitle("New drawing");
				newDialog.setMessage("Start new drawing (you will lose the current drawing)?");
				newDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
				    public void onClick(DialogInterface dialog, int which){
				        drawView.startNew();
				        dialog.dismiss();
				    }
				});
				newDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
				    public void onClick(DialogInterface dialog, int which){
				        dialog.cancel();
				    }
				});
				newDialog.show();
				break;
		}
	}


	@Override
	public void onBackPressed() {
		AlertDialog.Builder newDialog = new AlertDialog.Builder(this);
		newDialog.setTitle("Back Pressed");
		newDialog.setMessage("Back to main screen (you will lose the current progress)?");
		newDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
		    public void onClick(DialogInterface dialog, int which){
		    	close();
		        dialog.dismiss();
		    }
		});
		newDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
		    public void onClick(DialogInterface dialog, int which){
		        dialog.cancel();
		    }
		});
		newDialog.show();
	}
	
	private void close() {
		super.onBackPressed();
		Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
	}
	
	  public static final void zipDirectory( File directory, File zip ) throws IOException {
		    ZipOutputStream zos = new ZipOutputStream( new FileOutputStream( zip ) );
		    zip( directory, directory, zos );
		      zos.close();
		  }
		  
	  private static final void zip(File directory, File base,
	      ZipOutputStream zos) throws IOException {
	    File[] files = directory.listFiles();
	    byte[] buffer = new byte[8192];
	    int read = 0;
	    for (int i = 0, n = files.length; i < n; i++) {
	      if (files[i].isDirectory()) {
	        zip(files[i], base, zos);
	      } else {
	        FileInputStream in = new FileInputStream(files[i]);
	        ZipEntry entry = new ZipEntry(files[i].getPath().substring(
	            base.getPath().length() + 1));
	        zos.putNextEntry(entry);
	        while (-1 != (read = in.read(buffer))) {
	          zos.write(buffer, 0, read);
	        }
	        in.close();
	      }
	    }
	  }
	
	
	
}

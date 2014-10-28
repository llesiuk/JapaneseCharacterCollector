package com.jpchar;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.jpchar.structures.KanaSyllabary;

public class MainActivity extends Activity implements OnClickListener {
    
	private LinearLayout hiraganaLayout, katakanaLayout, kanjiLayout;
	private File directory;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set window for this Activity to full screen mode
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.main);
		
		// call the initialization elements
		initialize();		

		// access to the external memory for a further image saving
		directory = new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + "/");
		boolean success = true;
		if (!directory.exists()) {
		    success = directory.mkdir();
		}
		if (success) {
			new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + "/hiragana/").mkdir();
			new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + "/katakana/").mkdir();
			new File(Environment.getExternalStorageDirectory().toString() + "/" + getString(R.string.app_name) + "/kanji/").mkdir();
		}
    }
    
    private void initialize() {
    	// create instance of structure Class with static ArrayList
    	@SuppressWarnings("unused")
		KanaSyllabary kanaSyllabary = new KanaSyllabary();
    	
    	//initialize interface elements with click listeners
    	hiraganaLayout = (LinearLayout)findViewById(R.id.hiraganaLayout);
    	hiraganaLayout.setOnClickListener(this);
    	katakanaLayout = (LinearLayout)findViewById(R.id.katakanaLayout);
    	katakanaLayout.setOnClickListener(this);
    	kanjiLayout = (LinearLayout)findViewById(R.id.kanjiLayout);
    	kanjiLayout.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		Intent i = null;
		switch(v.getId()) {
			case R.id.hiraganaLayout:
				i = new Intent(getApplicationContext(), ViewCharActivity.class);
				i.putExtra("type", "hiragana");
				i.putExtra("counter", -1);
				startActivity(i);
				break;
				
			case R.id.katakanaLayout:
				i = new Intent(getApplicationContext(), ViewCharActivity.class);
				i.putExtra("type", "katakana");
				i.putExtra("counter", -1);
				startActivity(i);
				break;
				
			case R.id.kanjiLayout:
				i = new Intent(getApplicationContext(), ViewCharActivity.class);
				i.putExtra("type", "kanji");
				i.putExtra("counter", -1);
				startActivity(i);
				break;
		}
	}
}
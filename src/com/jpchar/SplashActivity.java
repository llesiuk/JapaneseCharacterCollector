package com.jpchar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
			
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
			getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
			setContentView(R.layout.splash);
			
			Thread timer = new Thread() {
				public void run() {
					try {
						sleep(1000);
					}
					catch(InterruptedException ie) {
						ie.printStackTrace();
					}
					startActivity(new Intent(SplashActivity.this, MainActivity.class));
				}
			};
			timer.start();
	}
	
	protected void onPause() {
		
		super.onPause();
		finish();
	}
}

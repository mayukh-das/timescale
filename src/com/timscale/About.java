package com.timscale;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class About extends Activity{

	TextView tvLine1,tvLine3,tvLine4;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.about);
		
		/*
		 * tvLine1 = (TextView) findViewById (R.id.tvLine1);
		 * tvLine1.setBackgroundResource(R.color.text_color);
		 * 
		 * tvLine3 = (TextView) findViewById (R.id.tvLine3);
		 * tvLine1.setBackgroundResource(R.color.text_color);
		 * 
		 * tvLine4 = (TextView) findViewById (R.id.tvLine4);
		 * tvLine1.setBackgroundResource(R.color.text_color);
		 */
	}
}
package com.timscale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyMenu extends Activity implements OnClickListener{
	
	Button bDiscover,bAbout,bReachOut;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.mymenu);
		initVars();
	}

	private void initVars()
	{		
		bDiscover = (Button) findViewById (R.id.bDiscover);
		bAbout    = (Button) findViewById (R.id.bAbout);
		bReachOut = (Button) findViewById (R.id.bReach);
		
		bDiscover.setOnClickListener(this);
		bAbout.setOnClickListener(this);
		bReachOut.setOnClickListener(this);
	}

	public void onClick(View v)
	{		
		switch(v.getId())
		{
			case R.id.bDiscover:
				 Intent iDiscover = new Intent(MyMenu.this,TimeScaleActivity.class);
				 startActivity(iDiscover);
			break;
			
			case R.id.bAbout:
				 Intent iAbout = new Intent(MyMenu.this,About.class);
				 startActivity(iAbout);
			break;
			
			case R.id.bReach:
				 Intent iReach = new Intent(MyMenu.this,ReachOut.class);
				 startActivity(iReach);
			break;
		}		
	}
}
package com.timscale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MySplash extends Activity{	
	
	@Override
	protected void onCreate(Bundle travlovbac)
	{
		super.onCreate(travlovbac);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.mysplash);
		
		Thread timer = new Thread()
		{			
			public void run()
			{				
				try
				{				
					sleep(3000);				
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally
				{
					Intent startIntent = new Intent("com.timescale.MYMENU");
					startActivity(startIntent);
				}
		    }
		};
		timer.start();
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		finish();
	}
}

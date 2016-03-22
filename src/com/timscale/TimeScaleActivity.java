package com.timscale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;

public class TimeScaleActivity extends Activity implements OnClickListener {
	Button bChooseDate;
	DatePicker dpDate;
	int selDay,selMonth,selYear;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        dpDate      = (DatePicker) findViewById (R.id.dpDate);
        bChooseDate = (Button)     findViewById (R.id.bChooseDate);
        bChooseDate.setOnClickListener(this);
    }
    
    public void onClick(View v)
	{
		switch(v.getId())
		{
			case R.id.bChooseDate:
				 selDay   = dpDate.getDayOfMonth();
				 selMonth = dpDate.getMonth();
				 selYear  = dpDate.getYear();
				 Bundle bundle = new Bundle();
				 bundle.putInt("Day", selDay);
				 bundle.putInt("Month", selMonth);
				 bundle.putInt("Year", selYear);
				 Intent intent = new Intent(TimeScaleActivity.this,Calculate.class);				 
				 intent.putExtras(bundle);
				 startActivity(intent);
			break;
		}
	}
}
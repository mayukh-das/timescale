package com.timscale;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class Calculate extends Activity implements OnItemClickListener{
	
	int selDay,selMonth,selYear;
	Calendar selCal;
	ListView lvDescDate;
	ListViewDisplayAdapter adapter;
	
	String Month[] = {"January","February","March","April","May","June","July",
			  		  "August"  ,"September","October", "November","December"};
	
	
	private static String desc[] = {"Original Date","10,000th Day","20,000th Day","1 Billionth Second","1,234,567,890 Seconds",
		                            "2 Billionth Second","1 Millionth Minute","10 Millionth Minute",
		                            "20 Millionth Minute","1 Billionth Minute","1,234,567,890 Minutes",
		                            "100,000 Hours","200,000 Hours","300,000 Hours",
		                            "100th Week","1000th Week","2000th Week","3000th Week"};

	private static String date[] = new String[18];

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.listviews);
		Bundle getData = getIntent().getExtras();
		selDay   = getData.getInt("Day");
		selMonth = getData.getInt("Month");
		selYear  = getData.getInt("Year");		
		
		lvDescDate = (ListView) findViewById (R.id.listView4);
		adapter = new ListViewDisplayAdapter(this, desc, date);
        lvDescDate.setAdapter(adapter);
        lvDescDate.setOnItemClickListener(this);		
		compute();
	}

	private void compute()
	{
		selCal   = Calendar.getInstance();		
		selCal.set(selYear, selMonth, selDay);
		
		/*---------------------------- ORIGINAL DATE ----------------------------*/
		
		date[0] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);		
		
		/*---------------------------- ORIGINAL DATE ----------------------------*/
		
		/*---------------------------- DAYS ----------------------------*/
		
		// ------------ SET 10000th Day ------------
		selCal.add(Calendar.DATE, 10000);	
		
		date[1] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);		
		
		// ------------ SET 20000th Day ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.DATE, 20000);		
		
		date[2] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);	
		
		
		/*---------------------------- SECONDS ----------------------------*/
		
		// ------------ SET 1 Billionth Second ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.SECOND, 1000000000);		
		
		date[3] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		// ------------ SET 1,234,567,890 Seconds ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.SECOND, 1234567890);
		
		date[4] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		// ------------ SET 2 Billionth Second ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.SECOND, 2000000000);		
		
		date[5] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		/*---------------------------- MINUTES ----------------------------*/
		
		// ------------ SET 1 Millionth Minute ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.MINUTE, 1000000);		
		
		date[6] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		// ------------ SET 10 Millionth Minute ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.MINUTE, 10000000);				
						
		date[7] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
				
		// ------------ SET 20 Millionth Minute ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.MINUTE, 20000000);
				
		date[8] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		// ------------ SET 1 Billionth Minute ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.MINUTE, 1000000000);		
			
		date[9] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		// ------------ SET 1,234,567,890  Minute ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.MINUTE, 1234567890);		
				
		date[10] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		/*---------------------------- HOURS ----------------------------*/
		
		// ------------ SET 100,000th Hour ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.HOUR, 100000);
			
		date[11] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		// ------------ SET 200,000th Hour ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.HOUR, 200000);
					
		date[12] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);	
				
		// ------------ SET 300,000th Hour ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.HOUR, 300000);
					
		date[13] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);	
		
		/*---------------------------- WEEKS ----------------------------*/
		
		//------------ SET 100th Week ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.WEEK_OF_YEAR, 100);		
		
		date[14] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		//------------ SET 1000th Week ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.WEEK_OF_YEAR, 1000);
		
		date[15] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		//------------ SET 2000th Week ------------ 
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.WEEK_OF_YEAR, 2000);
				
		date[16] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	              selCal.get(Calendar.YEAR);
		
		// ------------ SET 3000th Week ------------
		selCal.set(selYear, selMonth, selDay);
		selCal.add(Calendar.WEEK_OF_YEAR, 3000);
				
		date[17] = selCal.get(Calendar.DATE) + " " + Month[selCal.get(Calendar.MONTH)] + " " +
	               selCal.get(Calendar.YEAR);
	}

	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
	{
		Toast.makeText(this, "Event => " + desc[arg2] + "\n Date => " + date[arg2] , Toast.LENGTH_SHORT).show();
	}
}

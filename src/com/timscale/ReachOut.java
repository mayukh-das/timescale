package com.timscale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ReachOut extends Activity implements OnClickListener {
	
	Button sendEmail;
	EditText etName,etEmail,etSubject,etBody;
	String eName,eMailAdd,eSubject,eBody;
	String emailaddress[]={"epifun.dev@gmail.com"};

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.reachout);
		initVars();
	}

	private void initVars()
	{
		etName    = (EditText) findViewById (R.id.etName);
		etEmail   = (EditText) findViewById (R.id.etEmail);
		etSubject = (EditText) findViewById (R.id.etSubject);
		etBody    = (EditText) findViewById (R.id.etBody);
		
		sendEmail = (Button) findViewById (R.id.bSend);
		sendEmail.setOnClickListener(this);
	}

	public void onClick(View arg0)
	{
		convToString();
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, eSubject);
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, eBody);
		startActivity(emailIntent);
	}

	private void convToString()
	{
		eName    = etName.getText().toString();
		eMailAdd = etEmail.getText().toString();
		eSubject = etSubject.getText().toString();
		eBody    = etBody.getText().toString();
	}	
}
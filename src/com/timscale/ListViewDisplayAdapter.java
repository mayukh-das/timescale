package com.timscale;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewDisplayAdapter extends BaseAdapter{

	public String date[],desc[];
	public LayoutInflater inflater;	
	public Activity context;
	
	public ListViewDisplayAdapter(Activity context, String[] desc, String[] date) {
		// TODO Auto-generated constructor stub
		super();
		this.context = context;
		this.date = date;
		this.desc = desc;
		this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);		
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return desc.length;
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static class ViewHolder
	{		
		TextView tvDesc;
		TextView tvDate;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		ViewHolder holder;
		if(convertView==null)
		{
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.listitemrow, null);
			holder.tvDesc = (TextView) convertView.findViewById(R.id.tvDesc);
			holder.tvDate = (TextView) convertView.findViewById(R.id.tvDate);
			convertView.setTag(holder);
		}
		else
			holder=(ViewHolder)convertView.getTag();
		
		holder.tvDesc.setText(desc[position]);
		holder.tvDate.setText(date[position]);
		return convertView;
	}
}

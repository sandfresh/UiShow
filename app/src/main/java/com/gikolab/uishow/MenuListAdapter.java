package com.gikolab.uishow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuListAdapter extends BaseAdapter
{
	Context context;
	LayoutInflater inflater;
	String[] mTitle, mSubTitle;
	int[] mIcon;

	public MenuListAdapter(Context context, String[] title, String[] subtitle, int[] icon) 
	{
		this.context = context;
		this.mTitle = title;
		this.mSubTitle = subtitle;
		this.mIcon = icon;
	}

	@Override
	public int getCount() 
	{
		return mTitle.length;
	}

	@Override
	public Object getItem(int position) 
	{
		return mTitle[position];
	}

	@Override
	public long getItemId(int position) 
	{
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) 
	{
		TextView txtTitle, txtSubTitle;
		ImageView imgIcon;

		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View itemView = inflater.inflate(R.layout.drawer_list_item, parent,	false);

		txtTitle = (TextView) itemView.findViewById(R.id.title);
		txtSubTitle = (TextView) itemView.findViewById(R.id.subtitle);
		imgIcon = (ImageView) itemView.findViewById(R.id.icon);

		txtTitle.setText(mTitle[position]);
		txtSubTitle.setText(mSubTitle[position]);
		imgIcon.setImageResource(mIcon[position]);

		return itemView;
	}
}
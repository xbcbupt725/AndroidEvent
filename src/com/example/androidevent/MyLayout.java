package com.example.androidevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLayout extends LinearLayout{

	public MyLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		return super.onInterceptTouchEvent(ev);
		//return true;
	}
	
}

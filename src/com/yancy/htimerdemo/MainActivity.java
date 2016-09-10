package com.yancy.htimerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int count = 0 ;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView textView = (TextView)findViewById(R.id.info);
        Button start = (Button)findViewById(R.id.start);
        Button stop = (Button)findViewById(R.id.stop);
        
        final HTimer timer = new HTimer(new Runnable() {
			@Override
			public void run() {
				count += 1;
				textView.setText("" + count);
			}
		});
        
        start.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				timer.start(1000);
			}
		});
        stop.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				timer.stop();
			}
		});
    }
}
































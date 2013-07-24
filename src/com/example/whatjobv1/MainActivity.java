package com.example.whatjobv1;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		  Button go = (Button) findViewById(R.id.imageButton1);
	        go.setOnClickListener(new OnClickListener() { 
	        	public void onClick(View v) {
	        		Intent intent = new Intent(MainActivity.this, Questions.class);
	        		startActivity(intent);}});
	        
	        Button my_results = (Button) findViewById(R.id.imageButton2);
	        my_results.setOnClickListener(new OnClickListener() { 
	        	public void onClick(View v) {
	        		Intent intent = new Intent(MainActivity.this, My_Results.class);
	        		startActivity(intent);}});
	}

	
}

package com.example.cchange;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
 
public class MainActivity extends Activity {
 
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	       
	        // 액티비티 전환
	        Button button1 = (Button)findViewById(R.id.btn01);
	        button1.setOnClickListener(new OnClickListener() {
	           
	            @Override
	            public void onClick(View v) {
	                Toast.makeText(getApplicationContext(), "액티비티 전환", Toast.LENGTH_LONG).show();
	               
	                // 액티비티 전환 코드
	                Intent intent = new Intent(getApplicationContext(), new_activity.class);
	                startActivity(intent);
	            }
	        });
	 
	       
	        // btn2
	        Button button2 = (Button)findViewById(R.id.btn02);
	        button2.setOnClickListener(new OnClickListener() {
	           
	            @Override
	            public void onClick(View v) {
	                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/sks6624"));
	                startActivity(intent);
	            }
	        });
	 
	       
	        // btn3
	        Button button3 = (Button)findViewById(R.id.btn03);
	        button3.setOnClickListener(new OnClickListener() {
	           
	            @Override
	            public void onClick(View v) {
	                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1111-2222"));
	                startActivity(intent);
	            }
	        });
	    }
	 
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }
	 
	}
package com.example.cchange;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class new_activity extends Activity {
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
 
        Button button = (Button)findViewById(R.id.btn_back);
       
        button.setOnClickListener(new OnClickListener() {
           
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "���� ��Ƽ��Ƽ�� ���ư��ϴ�.", Toast.LENGTH_LONG).show();
               
                finish();
            }
        });
    }
 
}
package com.example.ktra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class profileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Button btnBack= (Button)
                findViewById(R.id.button3);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        Button btnOpen1=(Button)findViewById(R.id.button);
        btnOpen1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                doOpenChildActivity1();
            }
        });
    }

    public void doOpenChildActivity1()
    {
        Intent myIntent=new Intent(this, loginActivity.class);
        startActivity(myIntent);
    }


}

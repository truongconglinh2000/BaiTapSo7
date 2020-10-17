package com.example.ktra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listActivity extends AppCompatActivity {
    ListView lvSinger;
    ArrayList<Singer> arraySinger;
    SingerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c);

        Button btnOpen=(Button)findViewById(R.id.button);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                doOpenChildActivity();
            }
        });
        Button btnBack= (Button)
                findViewById(R.id.button3);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        AnhXa();
        adapter = new SingerAdapter(this, R.layout.line_singer, arraySinger);
        lvSinger.setAdapter(adapter);

    }
    public void doOpenChildActivity()
    {
        Intent myIntent=new Intent(this, profileActivity.class);
        startActivity(myIntent);
    }


    private void AnhXa() {
        lvSinger = (ListView) findViewById(R.id.listview);
        arraySinger = new ArrayList<>();
        arraySinger.add(new Singer("V", "BTS", R.drawable.v01));
        arraySinger.add(new Singer("Kim Jiso", "BlackPink", R.drawable.bi));
        arraySinger.add(new Singer("Kim Jenie", "BlackPink", R.drawable.jennie));
    }
}


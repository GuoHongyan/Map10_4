package com.example.map10_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBasicMap;
    Button btnLocationMap;
    Button btnFollowMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBasicMap=(Button)findViewById(R.id.btnBasicMap);
        btnBasicMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,BasicMapActivity.class);
                startActivity(i);
            }
        });
        btnLocationMap=(Button)findViewById(R.id.btnLocationMap);
        btnLocationMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,CustomLocationActivity.class);
                startActivity(i);
            }
        });
        btnFollowMap=(Button)findViewById(R.id.btnFollowMap);
        btnFollowMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MapFollowActivity.class);
                startActivity(i);
            }
        });
    }
}

package com.example.transfast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;

public class Chooseyourchoice extends AppCompatActivity {

    Button but_wanttransport,but_needtoload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseyourchoice);

        but_wanttransport = (Button) findViewById(R.id.but_wanttransport);
        but_needtoload = (Button) findViewById(R.id.but_needtoload);

        but_wanttransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotowant = new Intent(Chooseyourchoice.this,TransportDetails.class);
                startActivity(gotowant);
            }
        });


        but_needtoload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotoneed = new Intent(Chooseyourchoice.this,ItemsDetails.class);
                startActivity(gotoneed);
            }
        });
    }
}

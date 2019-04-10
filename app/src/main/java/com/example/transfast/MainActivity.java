package com.example.transfast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button but_signup_main,but_signin_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but_signin_main = (Button) findViewById(R.id.but_signin_main);
        but_signup_main = (Button) findViewById(R.id.but_signup_main);


        but_signin_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotosinin = new Intent(MainActivity.this,Login.class);
                startActivity(gotosinin);
            }
        });
    }
}

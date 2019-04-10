package com.example.transfast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    AppCompatButton but_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        but_login = (AppCompatButton) findViewById(R.id.but_login);

        but_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotologin = new Intent(Login.this,Chooseyourchoice.class);
                startActivity(gotologin);
            }
        });
    }
}

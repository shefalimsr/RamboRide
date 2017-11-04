package com.shefali.ramboride;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import mehdi.sakout.fancybuttons.FancyButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FancyButton button=(FancyButton) findViewById(R.id.create);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(login.this, SignUp.class));
            }
        });

        FancyButton button1=(FancyButton)findViewById(R.id.login);


        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(login.this, MainActivity.class));
            }
        });

        FancyButton button2=(FancyButton) findViewById(R.id.forgot);

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(login.this, forgotPassword.class));
            }
        });
    }
}

package com.shefali.ramboride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mehdi.sakout.fancybuttons.FancyButton;

public class forgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        FancyButton button1=(FancyButton) findViewById(R.id.v2);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(forgotPassword.this, forgot2.class));
            }
        });
    }
}

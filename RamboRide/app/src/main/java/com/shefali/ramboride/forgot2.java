package com.shefali.ramboride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mehdi.sakout.fancybuttons.FancyButton;

public class forgot2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot2);

        FancyButton button1=(FancyButton) findViewById(R.id.change);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(forgot2.this, login.class));
            }
        });
    }
}

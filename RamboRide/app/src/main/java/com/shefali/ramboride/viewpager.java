package com.shefali.ramboride;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class viewpager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        Button button=(Button)findViewById(R.id.button12);
        ImageView ig=(ImageView)findViewById(R.id.iv);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(viewpager.this, SignUp.class));
            }
        });

        Button button1=(Button)findViewById(R.id.button16);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(viewpager.this, login.class));
            }
        });


    }




}

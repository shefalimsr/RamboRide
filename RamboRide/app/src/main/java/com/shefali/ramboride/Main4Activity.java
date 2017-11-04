package com.shefali.ramboride;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class    Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        FloatingActionButton fil = (FloatingActionButton)findViewById(R.id.filter);
        fil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, filter.class));
            }
        });


        Button button = (Button)findViewById(R.id.crparty);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Main4Activity.this, Main5Activity.class));
            }
        });

    }
}

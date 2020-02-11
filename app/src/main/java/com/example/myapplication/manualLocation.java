package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class manualLocation extends AppCompatActivity {

    Button conf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_location);
        //implement the functionality to get the location...

        // upon getting the location...
        imp_conf();
    }
    public void imp_conf(){
        conf=(Button)findViewById(R.id.button5);
        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

    }
    public void open(){
        Intent intent=new Intent(this,Homepage.class);
        startActivity(intent);
    }
}

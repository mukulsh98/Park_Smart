package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {
    // Work to do:
        //1. Add location functionality...
        //2.then move to home page
    TextView t;
    Button loc,man;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        setname();// set the user name...
        locatebutton();
        manuallybutton();
    }
    public void setname(){
        Intent intent=getIntent();
        String uname=intent.getStringExtra("name");
        uname="hey "+uname;

        t=(TextView)findViewById(R.id.n1);
        t.setText(uname);
    }
    public void locatebutton(){

        loc=(Button)findViewById(R.id.button4);
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // add functionality to automatically locate the user...
                open();

            }
        });

    }
    public void manuallybutton(){
        man=(Button)findViewById(R.id.button6);
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open1();
            }
        });

    }
    public void open(){
        Intent intent=new Intent(this,Homepage.class);
        startActivity(intent);
    }
    public  void open1(){
        Intent intent=new Intent(this,manualLocation.class);
        startActivity(intent);
    }
}

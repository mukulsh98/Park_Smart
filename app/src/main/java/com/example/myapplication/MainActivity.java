package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button log,signin;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    EditText un,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=(EditText)findViewById(R.id.user_name);
        pass=(EditText)findViewById(R.id.pass);
        log=(Button) findViewById(R.id.button);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = un.getText().toString();
                String p = pass.getText().toString();
                //Toast t= Toast.makeText(getApplicationContext(),"username:"+uname+"  password:"+p+" ",Toast.LENGTH_LONG);
                //t.show();

                //database validation of username and password

                //if failed take again input

                //else and checking if its a valid email address
                if (un.getText().toString().isEmpty()) {
                    // empty email address...
                    Toast.makeText(getApplicationContext(), "enter email address", Toast.LENGTH_SHORT).show();
                } else {
                    if (un.getText().toString().trim().matches(emailPattern)) {
                        // valid email address...
                        open2(uname);

                    } else {
                        //invalid email address
                        Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
                    }




                }
            }
        });
        signin=(Button) findViewById(R.id.button2);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });

    }

    public void open2(String uname) {
        Intent i=new Intent(this,Screen2.class);
        i.putExtra("name",uname);
        startActivity(i);
    }
}

package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Birthday_Greet_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday__greet_);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        TextView wish_msg=findViewById(R.id.bd_wish);
        wish_msg.setText("Happy Birthday To \n"+name);
    }
}
package com.example.muheda.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=new Intent("com.example.muheda.mynewlibrary.MainNewActivity");
        startActivity(intent);

    }
}

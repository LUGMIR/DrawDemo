package com.example.drawdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //setContentView(new FirstDraw(this));
        setContentView(new DrawFractals(this));

        getSupportActionBar().hide();
    }
}
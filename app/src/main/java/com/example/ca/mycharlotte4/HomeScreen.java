package com.example.ca.mycharlotte4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void send_InfoScreen (View view){

        Intent InfoScreen = new Intent(this,com.example.ca.mycharlotte4.InfoScren.class);
        startActivity(InfoScreen);
    }


}

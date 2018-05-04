package com.example.ca.mycharlotte4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoScren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_scren);
    }

    public void waste_coll(View view){
        Intent weatherIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://charlottenc.gov/SWS/Mobile/Pages/index.html"));
        startActivity(weatherIntent);
    }

    public void air_water(View view) {
        Intent awIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://envisioncharlotte.com/water-waste-air/water/"));
        startActivity(awIntent);
    }

    public void traffic(View view) {
        Intent tIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.cmpd.org/trafficaccidents/"));
        startActivity(tIntent);
    }

    public void flights(View view) {
        Intent flIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cltairport.com/Pages/default.aspx"));
        startActivity(flIntent);
    }

    public void busr(View view) {
        Intent brIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://charlottenc.gov/cats/bus/routes/Pages/default.aspx"));
        startActivity(brIntent);
    }

    public void contact(View view) {
        Intent cuIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://charlottenc.gov/Pages/Home.aspx"));
        startActivity(cuIntent);
    }
}


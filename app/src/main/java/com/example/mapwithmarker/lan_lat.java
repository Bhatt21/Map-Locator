package com.example.mapwithmarker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class lan_lat extends AppCompatActivity {
    private Double p,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lan_lat);

    }



    public void clicked(View view) {
        String lat,lon;
        EditText txt1=(EditText) findViewById(R.id.lat);
        lat=txt1.getText().toString();


        EditText txt2=(EditText) findViewById(R.id.lon);
        lon=txt2.getText().toString();
p=Double.parseDouble(lat);
s=Double.parseDouble(lon);
       // p=Double.parseDouble(txt1.toString().trim());
        //s=Double.parseDouble(txt2.toString().trim());
       // p=2.321;
       // s=213.231;
        Intent intent =new Intent(this,MapsMarkerActivity.class);
        intent.putExtra("lon",p);
        intent.putExtra("lat",s);
        startActivity(intent);




    }
}

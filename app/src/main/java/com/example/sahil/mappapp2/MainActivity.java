package com.example.sahil.mappapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String mlat,mlong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this,MovingMap.class);
        mlat = "Jehangir Hospital,Pune";
        mlong = "DSK chandradeep,Mukund nagar";
        intent.putExtra("source",mlat);
        intent.putExtra("destination",mlong);
        startActivity(intent);
    }
}

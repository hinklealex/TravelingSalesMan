package com.example.alexhinkle.travelingsalesman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] cities = {"Mequon", "BrownDeer", "MKE", "Grafton" };
        String[] boarders = {"3","5","12" , "10"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TSP.createCiy(cities, boarders);
    }
}

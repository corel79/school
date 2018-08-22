package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Kong_Health = 10;
    int displayForKongVP = 0;
    int Captain_Fish_Health = 10;
    int Captain_Fish_VP = 0;
    int Mantis_Health = 10;
    int Mantis_VP = 0;
    int Mega_Shark_Health = 10;
    int Mega_Shark_VP = 0;
    int Drakonis_Health = 10;
    int Drakonis_VP = 0;
    int Sheriff_Health = 10;
    int Sheriff_VP = 0;
    int Rob_Health = 10;
    int Rob_VP = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Kong Victory Points (VP).
     */
    public void displayForKongVP(int KongVP) {
        TextView scoreView = (TextView) findViewById(R.id.Kong_VP);
        scoreView.setText(String.valueOf(KongVP));
    }

    public void addOnetoKongVP(View v) {
        displayForKongVP(+1);
    }

    public void subtractOnefromKongVP(View v) {
        displayForKongVP(-1);
    }
    /**
     * Displays the given score for Kong Victory Points (VP).
     */
    public void displayForKongVP(int KongVP) {
        TextView scoreView = (TextView) findViewById(R.id.Kong_VP);
        scoreView.setText(String.valueOf(KongVP));
    }

    public void addOnetoKongVP(View v) {
        displayForKongVP(+1);
    }

    public void subtractOnefromKongVP(View v) {
        displayForKongVP(-1);
    }

}



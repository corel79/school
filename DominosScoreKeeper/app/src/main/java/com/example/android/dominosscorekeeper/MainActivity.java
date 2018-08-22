package com.example.android.dominosscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int redPlayerScore = 0;
    int bluePlayerScore = 0;
    int greenPlayerScore = 0;
    int blackPlayerScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForBlackPlayer(0);
        displayForBluePlayer(0);
        displayForGreenPlayer(0);
        displayForRedPlayer(0);
    }



    /**
     * Displays the given score for Red Player.
     */
    public void displayForRedPlayer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redPlayerScore);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when the +5 button for Red Player is clicked
     */
    public void redPlayerScore (View view) {
        redPlayerScore = redPlayerScore +5;
        displayForRedPlayer(redPlayerScore);
    }

    /**
     * Displays the given score for Blue Player.
     */
    public void displayForBluePlayer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bluePlayerScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +5 button for Blue Player is clicked
     */
    public void bluePlayerScore (View view) {
        bluePlayerScore = bluePlayerScore +5;
        displayForBluePlayer (bluePlayerScore);
    }

    /**
     * Displays the given score for Green Player.
     */
    public void displayForGreenPlayer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.greenPlayerScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +5 button for Green Player is clicked
     */
    public void greenPlayerScore (View view) {
        greenPlayerScore = greenPlayerScore +5;
        displayForGreenPlayer (greenPlayerScore);
    }

    /**
     * Displays the given score for Black Player.
     */
    public void displayForBlackPlayer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blackPlayerScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the +5 button for Black Player is clicked
     */
    public void blackPlayerScore (View view) {
        blackPlayerScore = blackPlayerScore +5;
        displayForBlackPlayer(blackPlayerScore);
    }
}


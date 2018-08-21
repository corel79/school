package com.example.hannah.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity = quantity+1;
        display(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity-1;
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage= "Total: $"+ quantity*5 + "\n Thank You!";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
/**
 * Every thing from her down is for a King of Tokyo score keeper
 /**
 * Displays the given score for Kong Victory Points (VP).
 */
public void displayKongVP(int KongVP) {
    TextView scoreView = (TextView) findViewById(R.id.Kong_VP);
    scoreView.setText(String.valueOf(KongVP));
}

    /**
     * Displays the given score for Kong Health.
     */
    public void displayKongHealth(int KongH) {
        TextView scoreView = (TextView) findViewById(R.id.Kong_Health);
        scoreView.setText(String.valueOf(KongH));
    }



    /**
     * Displays the given score for Captain Fish Victory Points.
     */
    public void displayCaptianFishVP(int CaptainFishVP) {
        TextView scoreView = (TextView) findViewById(R.id.Captain_Fish_VP);
        scoreView.setText(String.valueOf(CaptainFishVP));
    }

    /**
     * Displays the given score for Captain Fish Health.
     */
    public void displayForCaptainFishHealth(int CaptainFishH) {
        TextView scoreView = (TextView) findViewById(R.id.Captain_Fish_Health);
        scoreView.setText(String.valueOf(CaptainFishH));
    }

    /**
     * Displays the given score for Mantis Victory Points (VP).
     */
    public void displayForMantisVP(int MantisVP) {
        TextView scoreView = (TextView) findViewById(R.id.Mantis_VP);
        scoreView.setText(String.valueOf(MantisVP));
    }

    /**
     * Displays the given score for Mantis Health.
     */
    public void displayForMantisHealth(int MantisH) {
        TextView scoreView = (TextView) findViewById(R.id.Mantis_Health);
        scoreView.setText(String.valueOf(MantisH));
    }

    /**
     * Displays the given score for Mega Shark Victory Points (VP).
     */
    public void displayMegaSharkVP(int MegaSharkVP) {
        TextView scoreView = (TextView) findViewById(R.id.Mega_Shark_VP);
        scoreView.setText(String.valueOf(MegaSharkVP));
    }

    /**
     * Displays the given score for Mega Shark Health.
     */
    public void displayMegaSharkHealth(int MegaSharkH) {
        TextView scoreView = (TextView) findViewById(R.id.Mega_Shark_Health);
        scoreView.setText(String.valueOf(MegaSharkH));
    }
    /**
     * Displays the given score for Drakonis Victory Points (VP).
     */
    public void displayDrakonisVP(int DrakonisVP) {
        TextView scoreView = (TextView) findViewById(R.id.Drakonis_VP);
        scoreView.setText(String.valueOf(DrakonisVP));
    }

    /**
     * Displays the given score for Drakonis Health.
     */
    public void displayDrakonisHealth(int DrakonisH) {
        TextView scoreView = (TextView) findViewById(R.id.Drakonis_Health);
        scoreView.setText(String.valueOf(DrakonisH));
    }

    /**
     * Displays the given score for Sheriff Victory Points (VP).
     */
    public void displaySheriffVP(int SheriffVP) {
        TextView scoreView = (TextView) findViewById(R.id.Sheriff_VP);
        scoreView.setText(String.valueOf(SheriffVP));
    }

    /**
     * Displays the given score for Sheriff Health.
     */
    public void displaySheriffHealth(int SheriffH) {
        TextView scoreView = (TextView) findViewById(R.id.Sheriff_Health);
        scoreView.setText(String.valueOf(SheriffH));
    }

    /**
     * Displays the given score for Rob Victory Points (VP).
     */
    public void displayRobVP(int RobVP) {
        TextView scoreView = (TextView) findViewById(R.id.Rob_VP);
        scoreView.setText(String.valueOf(RobVP));
    }

    /**
     * Displays the given score for Rob Health.
     */
    public void displayRob_Health(int RobH) {
        TextView scoreView = (TextView) findViewById(R.id.Rob_Health);
        scoreView.setText(String.valueOf(RobH));
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increaseRobH(View view) {
        Rob_Health = Rob_Health+1;
        displayRob_Health(int RobH);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decreaseRobH(View view) {
        Rob_Health = Rob_Health - 1;
        displayRob_Health(int RobH);
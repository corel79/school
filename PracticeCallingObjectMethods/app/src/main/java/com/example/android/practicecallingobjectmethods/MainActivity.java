package com.example.android.practicecallingobjectmethods;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        TextView textView = new TextView (this);
        textView.setText("Good morning Sexy!");
        textView.setTextColor(Color.MAGENTA);
        textView.setAllCaps(true);
        textView.setTextSize(45);

        setContentView(textView);

        View nameTextView = findViewById(R.id.name);
        nameTextView.setTex ("Laura");
    }

    ImageView iconImageView = findViewById(R.id.icon);
    iconImageView.setImageResourse(R.drawable.logo);

    View textView = findViewById(R.id.title);
    textView.setVisibility(View.GONE);
}

package com.example.screens;

import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // get intent
        android.content.Intent intent = getIntent();
        // get data from intent
        String message = intent.getStringExtra("com.example.screens.MESSAGE");

        // set text of textView
        android.widget.TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        // Initialize the ImageView widget
        ImageView imageView = findViewById(R.id.imageView);

        // Load the image using Glide
        Glide.with(this)
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Ironagegrave-aland1.jpg/250px-Ironagegrave-aland1.jpg")
                .into(imageView);
    }
}

package com.example.screens;

import android.app.Activity;

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

        
    }
}

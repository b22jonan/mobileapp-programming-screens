package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // function to start second activity
    public void startSecondActivity(android.view.View view) {
        // create an intent to start second activity
        android.content.Intent intent = new android.content.Intent(this, SecondActivity.class);
        // add data to intent
        intent.putExtra("com.example.screens.MESSAGE", "Hello from MainActivity!");

        // start second activity
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        // set onClickListener for button
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                startSecondActivity(view);
            }
        });

    }
}

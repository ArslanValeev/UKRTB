package com.example.wdcinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(5 * 1000);
                    Intent i = new Intent(splashscreen.this, registration.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {

                }

            }


        };
        background.start();
    }
}


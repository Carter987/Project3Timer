package com.example.cartb.project3timer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    private boolean timerRunning;
    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.Timer);
    }

    public void startTimer(View v) {
        if (timerRunning == false ){
            chronometer.start();
            timerRunning = true;
        }
    }

    public void pauseTimer(View v) {
        if (timerRunning == true){
            chronometer.stop();
            timerRunning = false;

        }

    }

    public void resetTimer(View v){

    }
}

package com.example.cartb.project3timer;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    private boolean timerRunning;
    private long pauseOffset;
    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.Timer);
        chronometer.setBase(SystemClock.elapsedRealtime());
    }

    public void startTimer(View v) {
        if (timerRunning == false ){
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            chronometer.start();
            timerRunning = true;
        }
    }

    public void pauseTimer(View v) {
        if (timerRunning == true){
            chronometer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            timerRunning = false;

        }

    }

    public void resetTimer(View v){
    chronometer.setBase(SystemClock.elapsedRealtime());
    pauseOffset = 0;
    }
}

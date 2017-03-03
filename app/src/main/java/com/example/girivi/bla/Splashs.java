package com.example.girivi.bla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;

public class Splashs extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int progress = 0;
        ProgressBar simpleProgressBar;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashs);
        simpleProgressBar = (ProgressBar) findViewById(R.id.simpleProgressBar);
        simpleProgressBar.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                Intent i = new Intent(Splashs.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}

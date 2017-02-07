package com.example.kevin.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView group_ranking;
    TextView my_ranking;
    ProgressBar my_steps;
    ProgressBar group_steps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group_ranking = (TextView) findViewById(R.id.group_ranking_textview);
        my_ranking = (TextView) findViewById(R.id.my_ranking_textview);
        my_steps = (ProgressBar) findViewById(R.id.my_steps_progressbar);
        group_steps = (ProgressBar) findViewById(R.id.group_steps_progressbar);

        my_steps.setProgress(50);
        group_steps.setProgress(37);

    }
}

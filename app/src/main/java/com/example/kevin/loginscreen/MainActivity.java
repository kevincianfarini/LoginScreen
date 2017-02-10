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
    TextView my_steps_text;
    TextView group_steps_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group_ranking = (TextView) findViewById(R.id.group_ranking_textview);
        my_ranking = (TextView) findViewById(R.id.my_ranking_textview);
        my_steps = (ProgressBar) findViewById(R.id.my_steps_progressbar);
        group_steps = (ProgressBar) findViewById(R.id.group_steps_progressbar);
        group_steps_text = (TextView) findViewById(R.id.group_steps_text);
        my_steps_text = (TextView) findViewById(R.id.my_steps_text);

        my_steps.setProgress(50);
        group_steps.setProgress(37);

        group_ranking.setText("3/47");
        my_ranking.setText("8/512");
        my_steps_text.setText("1,151 steps");
        group_steps_text.setText("18,000 steps");

    }
}

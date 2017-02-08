package com.example.kevin.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }

    public void checkLogin(View v) {
        if ((this.username.getText().toString().equals("Kevin")) &&
                (this.password.getText().toString().equals("poop"))) {
            this.launchMain();
        } else {
            Snackbar.make(findViewById(R.id.password), "Wrong username or password, dummy", Snackbar.LENGTH_LONG).show();
        }
    }

    public void launchMain() {
        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
        this.finish();
    }
}

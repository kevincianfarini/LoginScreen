package com.example.kevin.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private ImageView login_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        login_button = (ImageView) findViewById(R.id.login_button);
    }

    public void checkLogin(View v) {
        if ((this.username.getText().toString().equals("Kevin")) &&
                (this.password.getText().toString().equals("poop"))) {
            this.launchMain();
        }
    }

    public void launchMain() {
        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
        this.finish();
    }
}

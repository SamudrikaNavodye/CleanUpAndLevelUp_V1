package com.example.cleanupandlevelup_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {

    private TextInputEditText textInputEditTextUsername, textInputEditTextPassword;
    private Button btnlogin;
    private TextView textViewSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputEditTextUsername = findViewById(R.id.username);
        textInputEditTextPassword = findViewById(R.id.password);
        textViewSignup = findViewById(R.id.signUpText);
        btnlogin = findViewById(R.id.buttonLogin);

        textViewSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activitySignUp = new Intent(Login.this, SignUp.class);
                startActivity(activitySignUp);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityLogin = new Intent(Login.this, LoginSuccessActivity.class);
                startActivity(activityLogin);
                finish();
            }
        });
    }
}
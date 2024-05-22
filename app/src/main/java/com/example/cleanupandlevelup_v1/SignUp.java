package com.example.cleanupandlevelup_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {

    private TextInputEditText textInputEditTextFullname, textInputEditTextUsername, textInputEditTextPassword, textInputEditTextEmail;
    private Button buttonSignup;
    private TextView textViewLogin;
    private ProgressBar progressBarSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        textInputEditTextFullname = findViewById(R.id.fullnameSignup);
        textInputEditTextUsername = findViewById(R.id.usernameSignup);
        textInputEditTextPassword = findViewById(R.id.passwordSignup);
        textInputEditTextEmail = findViewById(R.id.emailSignup);
        buttonSignup = findViewById(R.id.buttonSignUp);
        textViewLogin = findViewById(R.id.loginText);
        progressBarSignUp = findViewById(R.id.progressSignup);

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

//        buttonSignup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String fullName = String.valueOf(textInputEditTextFullname.getText());
//                String userName = String.valueOf(textInputEditTextUsername.getText());
//                String password = String.valueOf(textInputEditTextPassword.getText());
//                String email = String.valueOf(textInputEditTextEmail.getText());
//
//                if (!fullName.equals("") && !userName.equals("") && !password.equals("") && !email.equals("")) {
//                    //Start ProgressBar first (Set visibility VISIBLE)
//                    progressBarSignUp.setVisibility(View.VISIBLE);
//                    Handler handler = new Handler(Looper.getMainLooper());
//                    handler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            //Starting Write and Read data with URL
//                            //Creating array for parameters
//                            String[] field = new String[4];
//                            field[0] = "fullname";
//                            field[1] = "username";
//                            field[2] = "password";
//                            field[3] = "email";
//                            //Creating array for data
//                            String[] data = new String[4];
//                            data[0] = fullName;
//                            data[1] = userName;
//                            data[2] = password;
//                            data[3] = email;
//                            PutData putData = new PutData("http://192.168.141.71/loginRegister/signup.php", "POST", field, data);
//                            if (putData.startPut()) {
//                                if (putData.onComplete()) {
//                                    String result = putData.getResult();
//                                    //End ProgressBar (Set visibility to GONE)
//                                    progressBarSignUp.setVisibility(View.GONE);
//                                    //Log.i("PutData", result);
//                                    if (result.equals("Sign Up Success")){
//                                        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
//                                        Intent intent = new Intent(getApplicationContext(),login.class);
//                                        startActivity(intent);
//                                        finish();
//
//                                    } else{
//                                        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
//                                    }
//                                }
//                            }
//                            //End Write and Read data with URL
//                        }
//                    });
//                } else {
//                    Toast.makeText(getApplicationContext(),"All Fields Are Required", Toast.LENGTH_SHORT).show();
//                }
//
//
//            }
//        });




    }

}
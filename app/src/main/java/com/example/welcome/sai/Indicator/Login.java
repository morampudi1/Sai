package com.example.welcome.sai.Indicator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.welcome.sai.R;

public class Login extends AppCompatActivity {
    EditText username, pass;
    Button login;
    TextView forgot, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.etusername1);
        pass = (EditText) findViewById(R.id.etpass1);
        login = (Button) findViewById(R.id.button1);
        forgot = (TextView) findViewById(R.id.forgot);
        signup = (TextView) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().isEmpty()) {
                    username.requestFocus();
                    username.setError("please provide name");
                } else if (pass.getText().toString().isEmpty()) {
                    pass.requestFocus();
                    pass.setError("enter pasword");
                }else {
                    Intent intent = new Intent(Login.this, GridviewActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}


package com.example.welcome.sai.Indicator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.welcome.sai.R;

public class RegistrationActivity extends AppCompatActivity {
    EditText name1, fname, mobile, email;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        name1 = (EditText) findViewById(R.id.name1);
        fname = (EditText) findViewById(R.id.et_fname);
        mobile = (EditText) findViewById(R.id.et_mobil);
        email = (EditText) findViewById(R.id.et_email);
        submit = (Button) findViewById(R.id.sub1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name1.getText().toString().isEmpty()) {
                    name1.requestFocus();
                    name1.setError("please provide name");
                } if (fname.getText().toString().isEmpty()) {
                    fname.requestFocus();
                    fname.setError("please provide mobile number");
                }  if (mobile.length() != 10) {
                    mobile.requestFocus();
                    mobile.setError("Please enter 10 digit mobile number");
                } if (email.getText().toString().isEmpty()) {
                    email.requestFocus();
                    email.setError("please provide email id");
                }else {
                    Intent intent = new Intent(RegistrationActivity.this, Login.class);
                    startActivity(intent);
                }

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
      //getSupportActionBar().setTitle("defaulttoolbar");
    }
    public boolean onSupportNavigateUp() {
        Intent intent=new Intent(RegistrationActivity.this,Login.class);
        startActivity(intent);
        return true;
    }
}



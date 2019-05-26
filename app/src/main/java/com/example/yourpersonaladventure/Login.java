package com.example.yourpersonaladventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btnRegOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegOK =  findViewById(R.id.btnRegOK);
    }


    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnRegOK:
                Intent intent = new Intent(this, Registration.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

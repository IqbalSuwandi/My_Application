package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void ButtonLogin(View view) {
        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Login.this,Menu.class));
    }

    public void DaftarAkun(View view) {
        startActivity(new Intent(Login.this,Register.class));
    }
}
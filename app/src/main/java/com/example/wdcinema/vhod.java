package com.example.wdcinema;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vhod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vhod);
    }

    public void oasd(View view) {
        Intent vhod = new Intent(this, registration.class);
        startActivity(vhod);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Успешная регистрация");
        alert.show();
    }

    public void est(View view) {
        Intent est = new Intent(this, registration.class);
        startActivity(est);
    }
}
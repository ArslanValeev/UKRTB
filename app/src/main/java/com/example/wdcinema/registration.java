package com.example.wdcinema;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registration extends AppCompatActivity {
    final int id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void SignUpClick(View view){

        EditText logT = findViewById(R.id.editTextTextEmailAddress);
        EditText passT = findViewById(R.id.editTextTextPassword);
        String Log = logT.getText().toString();
        String Pass = passT.getText().toString();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        Intent i = new Intent(this, scroll.class);
        if ( Log.equals ( "wsr" ) || Pass.equals ( "wsr" ) ){
            startActivity(i);
            return;
        }else {
            alert.setMessage("Не верный логин или пароль");
            alert.setTitle("Ошибка");
            alert.show();

        }
    }



    public void asd (View view){
        Intent est = new Intent(this, vhod.class);
        startActivity(est);
    }
}

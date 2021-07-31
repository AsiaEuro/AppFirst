package com.example.meassageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText txtMoney;
Button btnExchange;
Button btnClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMoney=(EditText )findViewById(R.id.txtMoney ) ;
        btnClose =(Button )findViewById(R.id.btnClose ) ;
        btnClose .setOnClickListener((v) -> {
        finish();
        System.exit( 0);
        });
        btnExchange =(Button )findViewById(R.id.btnExchange );

    }
}
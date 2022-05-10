package com.example.droidcafedesserts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    TextView tVMes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        tVMes = findViewById(R.id.tVMes);
        Intent i =getIntent();
        String mes = i.getStringExtra("cake");
        tVMes.setText(mes);
    }
}
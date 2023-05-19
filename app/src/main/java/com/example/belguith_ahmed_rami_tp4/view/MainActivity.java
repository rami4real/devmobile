package com.example.belguith_ahmed_rami_tp4.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belguith_ahmed_rami_tp4.R;
import com.example.belguith_ahmed_rami_tp4.controler.controller;

public class MainActivity extends AppCompatActivity {

    private EditText txtTND;
    private Button btnConvert;
    private TextView lbEUR, lbUSD, lbGBP;
    controller controler = controller.getInstance();

    private void init() {
        txtTND = (EditText) findViewById(R.id.txtTND);
        btnConvert = (Button) findViewById(R.id.button_id);
        lbEUR = (TextView) findViewById(R.id.txtEUR);
        lbUSD = (TextView) findViewById(R.id.txtUSD);
        lbGBP = (TextView) findViewById(R.id.txtGBP);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnConvert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                convert();
            }
        });
    }
    public void convert(){
    Intent intent =new Intent(MainActivity.this,Resultactivity.class);
        Double dinar = null;
        try {
            dinar = Double.parseDouble(txtTND.getText().toString());
        } catch (Exception e) {
        }
        intent.putExtra("dinar",dinar.toString());
    startActivity(intent);
    lbEUR.setText(Double.toString(controller.getEuro()));
    lbUSD.setText(Double.toString(controller.getUsd()));
    lbGBP.setText(Double.toString(controller.getGbp()));
    }
}
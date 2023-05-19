package com.example.belguith_ahmed_rami_tp4.view;


import static android.graphics.Color.convert;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belguith_ahmed_rami_tp4.R;
import com.example.belguith_ahmed_rami_tp4.controler.controller;

public class Resultactivity extends AppCompatActivity {
    private double D1,D2,D3,D4,D5,D6;
    private TextView E1,E2,E3,E4,E5,E6;
    Intent intent ;
    Button btnReturn;
    controller controler =controller.getInstance();

    private void init() {
        E1 = (TextView) findViewById(R.id.DToE1);
        E2 = (TextView) findViewById(R.id.DToE2);
        E3 = (TextView) findViewById(R.id.DToE3);
        E4 = (TextView) findViewById(R.id.DToE4);
        E5 = (TextView) findViewById(R.id.DToE5);
        E6 = (TextView) findViewById(R.id.DToE6);
        D1=1;
        D2=10;
        D3=50;
        D4=100;
        D5=200;
        String dinarString = intent.getStringExtra("dinar");  // récupération du montant en dinars à partir de l'intent
        if (dinarString != null) {
            D6 = Double.parseDouble(dinarString);  // conversion du montant en dinars en double
        }
        btnReturn = (Button) findViewById(R.id.btnReturn);  // initialisation du bouton retour
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        intent = getIntent();  // récupération de l'intent qui a démarré cette activité
        init();  // appel de la méthode d'initialisation
        convert();  // appel de la méthode pour convertir les montants en dinars en euros
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Appeler finish() pour terminer l'activité en cours et retourner à l'activité précédente
                finish();
            }
        });
    } public void Convert(){  // méthode pour convertir les montants en dinars en euros
        controller.createModel(D1);  // création d'un modèle de conversion pour le montant D1
        E1.setText(Double.toString(D1)+"Dinars = "+Double.toString(controller.getEuro())+"euro\n"); // affichage du résultat de la conversion pour le montant D1
        controller.createModel(D2);  // création d'un modèle de conversion pour le montant D2
        E2.setText(Double.toString(D2)+"Dinars = "+Double.toString(controller.getEuro())+"euro\n"); // affichage du résultat de la conversion pour le montant D2
        controller.createModel(D3); // création d'un modèle de conversion pour le montant D3
        E3.setText(Double.toString(D3)+"Dinars = "+Double.toString(controller.getEuro())+"euro\n"); // affichage du résultat de la conversion pour le montant D3
        controller.createModel(D4); // création d'un modèle de conversion pour le montant D4
        E4.setText(Double.toString(D4)+"Dinars = "+Double.toString(controller.getEuro())+"euro\n"); // affichage du résultat de la conversion pour le montant D4
        controller.createModel(D5); // création d'un modèle de conversion pour le montant D5
        E5.setText(Double.toString(D5)+"Dinars = "+Double.toString(controller.getEuro())+"euro\n"); // affichage du résultat de la conversion pour le montant D5
        controller.createModel(D6); // création d'un modèle de conversion pour le montant D6
        E6.setText(Double.toString(D6)+"Dinars = "+Double.toString(controller.getEuro())+"euro\n"); // affichage du résultat de la conversion pour le montant D6
    }
}

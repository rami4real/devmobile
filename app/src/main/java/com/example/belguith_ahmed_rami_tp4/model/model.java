package com.example.belguith_ahmed_rami_tp4.model;

public class model {
    private Double euro, usd, gbp,dinar;
    public model(Double dinar){
        this.dinar=dinar;
        convert();
    }//code de update(constructeur)
    private void convert() {
        //Formule de conversion
        euro =(double) dinar / 3.3360;
        usd = (double)dinar / 3.7830;
        gbp = (double)dinar / 3.1130;
    }
    public Double getEuro() {
        return euro;
    }//notify controller
    public Double getGbp() {
        return gbp;
    }//notify controller
    public Double getUsd() {
        return usd;
    }//notify controller
}

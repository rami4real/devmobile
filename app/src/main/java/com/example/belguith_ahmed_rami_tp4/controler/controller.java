package com.example.belguith_ahmed_rami_tp4.controler;

import com.example.belguith_ahmed_rami_tp4.model.model;

public class controller {
    private static model model;
    private static controller instance =null;
    private controller (){
        super();
    }
    public final static controller getInstance(){
        if(controller.instance==null){
            controller.instance=new controller();
        }
        return controller.instance;
    }
    public static void createModel(Double dinar){model=new model(dinar);}
    public static double getEuro(){
        return model.getEuro();
    }
    public static double getGbp(){
        return model.getGbp();
    }
    public static double getUsd(){
        return model.getUsd();
    }

}

package com.example.intents.shopping.infrastructure;

import android.app.Application;
import com.squareup.otto.Bus;

public class shoppingapplicaion extends Application {

    private Bus bus;
    public shoppingapplicaion(){
        bus=new Bus();

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
   public  Bus getBus(){
       return bus;
   }
}

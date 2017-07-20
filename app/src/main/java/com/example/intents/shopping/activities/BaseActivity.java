package com.example.intents.shopping.activities;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.intents.shopping.infrastructure.shoppingapplicaion;
import com.squareup.otto.Bus;

public class BaseActivity extends AppCompatActivity {
protected shoppingapplicaion application;
protected Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application=(shoppingapplicaion) getApplication();
        bus=application.getBus();
        bus.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}

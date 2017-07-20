package com.example.intents.shopping.dialog;


import android.app.DialogFragment;
import android.os.Bundle;
import com.example.intents.shopping.infrastructure.shoppingapplicaion;
import com.squareup.otto.Bus;

public class BaseDialog extends DialogFragment{
protected shoppingapplicaion application;
    protected Bus bus;


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bus.unregister(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

application=(shoppingapplicaion) getActivity().getApplication();
        bus=application.getBus();
        bus.register(this);





    }
}

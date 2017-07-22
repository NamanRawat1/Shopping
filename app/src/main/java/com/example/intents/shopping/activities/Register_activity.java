package com.example.intents.shopping.activities;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.widget.Button;
import com.example.intents.shopping.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Register_activity extends BaseActivity {
@BindView(R.id.regist_button)
    Button regist_button;
@BindView(R.id.activity_register)
    ConstraintLayout register_section;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
        register_section.setBackgroundResource(R.drawable.background_screen_two);
    }

    @OnClick(R.id.regist_button)
    public void setRegister_button(){

        startActivity(new Intent(this,loginActivity.class));
        finish();
    }

}

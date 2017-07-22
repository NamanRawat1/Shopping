package com.example.intents.shopping.activities;
import android.content.Intent;
import com.example.intents.shopping.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class loginActivity extends BaseActivity {

@BindView(R.id.login_section)
    ConstraintLayout mConstraintLayout;

@BindView(R.id.register_button)
    Button register_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        mConstraintLayout.setBackgroundResource(R.drawable.background_screen_two);
    }
    @OnClick(R.id.regist_button)
    public void setRegister_button(){

        startActivity(new Intent(this,Register_activity.class));
        finish();
    }

}

package com.expert.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LoginActivity extends Activity {

    private TextView txtWelcomeMessage;
    private EditText edtPassword;
    private EditText edtUserName;
    private Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_activity);
        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);
        edtUserName = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new BtnSignInClickListener());

    }
    private class BtnSignInClickListener implements View.OnClickListener{
        public void onClick(View v){
            if(edtUserName.getText().toString().equals("bitcode") && edtPassword.getText().toString().equals("bitcode@1234")){
                txtWelcomeMessage.setText("Welcome "+edtUserName.getText().toString());
            }
            else{
                txtWelcomeMessage.setText("Login Failed..");
            }
        }
    }
}

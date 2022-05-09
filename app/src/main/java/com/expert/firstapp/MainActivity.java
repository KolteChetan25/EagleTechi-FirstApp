package com.expert.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText edtusername,edtPassword;
    private TextView txtWelcomeMessage;
    private Button btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainContenerLayout = new LinearLayout(this);
        mainContenerLayout.setOrientation(LinearLayout.VERTICAL);
        mainContenerLayout.setPadding(20,20,20,40);
        mainContenerLayout.setGravity(Gravity.CENTER_VERTICAL| Gravity.CENTER_HORIZONTAL);

        ViewGroup.LayoutParams layoutParams =
                new ViewGroup.LayoutParams(
                       ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                );

        mainContenerLayout.setLayoutParams(layoutParams);


        txtWelcomeMessage = new TextView( this);
        txtWelcomeMessage.setText("Welcome to Android @BitCode Pune");
        txtWelcomeMessage.setTextSize(30);
        txtWelcomeMessage.setTextColor(Color.BLACK);

        ViewGroup.LayoutParams paramForView =
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

        txtWelcomeMessage.setLayoutParams(paramForView);

        mainContenerLayout.addView(txtWelcomeMessage);
        //setContentView(txtWelcomeMessage);

        edtusername = new EditText(this);
        edtusername.setHint("Enter UserName");
        edtusername.setLayoutParams(paramForView);
        //setContentView(edtusername);
        mainContenerLayout.addView(edtusername);

        edtPassword = new EditText(this);
        edtPassword.setLayoutParams(paramForView);
        mainContenerLayout.addView(edtPassword);

        Button btnSignIn = new Button(this);
        btnSignIn.setText("Sign In");
        btnSignIn.setLayoutParams(paramForView);
        mainContenerLayout.addView(btnSignIn);

        setContentView(mainContenerLayout);

        btnSignIn.setOnClickListener(new BtnSignInClickListener());


        //setContentView(R.layout.activity_main);
    }

    class BtnSignInClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if(edtusername.getText().toString().equals("bitcode") && edtPassword.getText().toString().equals("bitcode@123")){
                txtWelcomeMessage.setText("Welcome "+edtusername.getText().toString());
            }
            else{
                txtWelcomeMessage.setText("Login Failed...");
            }
        }
    }
}
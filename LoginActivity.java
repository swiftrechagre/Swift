package com.example.ronny.Swift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by fred on 3/18/2017.
 */

public class LoginActivity extends Activity {
   Button login;
    DatabaseHelper helper =new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);


        login = (Button) findViewById(R.id.button7);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(new Intent(LoginActivity.this, Welcome.class));

    }
        });
    }}
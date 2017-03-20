package com.example.ronny.Swift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by fred on 3/18/2017.
 */

public class Home extends Activity {

    Button hist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

       hist= (Button) findViewById(R.id.history);
        hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,Purchase.class));
            }
        });
    }
}


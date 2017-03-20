package com.example.ronny.Swift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by fred on 3/18/2017.
 */
public class SuccessFull extends Activity{
    Button suck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.successful);

        suck= (Button) findViewById(R.id.button5);
        suck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paydet=new Intent(SuccessFull.this,PaymentDetails.class);
                startActivity(paydet);
            }
        });


    }
}

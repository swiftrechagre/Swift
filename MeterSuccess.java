package com.example.ronny.Swift;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by fred on 3/18/2017.
 */

public class MeterSuccess extends Activity {
    Button ok,con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);
        ok= (Button) findViewById(R.id.button4);
        con= (Button) findViewById(R.id.button2);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MeterSuccess.this,AnotherImage.class);
                startActivity(intent);            }
        });
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cont=new Intent(MeterSuccess.this,Verify.class);
                startActivity(cont);
            }
        });


    }
}

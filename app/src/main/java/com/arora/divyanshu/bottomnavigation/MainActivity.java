package com.arora.divyanshu.bottomnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button own,inbuilt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        own = findViewById(R.id.own);
        inbuilt = findViewById(R.id.inbuilt);




        inbuilt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inbuilt = new Intent(getApplicationContext(),Inbuilt.class);
                startActivity(inbuilt);
            }
        });



    }
}

package com.example.myquizeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DeveloperActivity extends AppCompatActivity {
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        btnback = (Button) findViewById(R.id.button4);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in2);
            }
        });
    }
}

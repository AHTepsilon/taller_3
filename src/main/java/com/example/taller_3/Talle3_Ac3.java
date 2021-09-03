package com.example.taller_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Talle3_Ac3 extends AppCompatActivity {

    Button calculateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talle3_ac3);

        calculateBtn = findViewById(R.id.calculateButton);

        calculateBtn.setOnClickListener(
                (view) ->
                {
                    moveToNextScreen();
                }
        );
    }

    public void moveToNextScreen()
    {
        Intent switchActivity = new Intent(this, taller3_Ac4.class);
        startActivity(switchActivity);
    }
}
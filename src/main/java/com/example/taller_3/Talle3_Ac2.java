package com.example.taller_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Talle3_Ac2 extends AppCompatActivity {

    Button configBtn, continueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talle3_ac2);

        configBtn = findViewById(R.id.configButton);
        continueBtn = findViewById(R.id.continueButton);

        configBtn.setOnClickListener(
                (view) ->
                {
                    moveToPreviousScreen();
                }
        );

        continueBtn.setOnClickListener(
                (view) ->
                {
                    moveToNextScreen();
                }
        );
    }

    public void moveToNextScreen()
    {
        Intent switchActivity = new Intent(this, Talle3_Ac3.class);
        startActivity(switchActivity);
    }

    public void moveToPreviousScreen()
    {
        Intent switchActivityPrevious = new Intent(this, MainActivity.class);
        startActivity(switchActivityPrevious);
    }
}
package com.example.taller_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button switchScreenBlue, switchScreenWhite, switchScreenBlack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchScreenBlue = findViewById(R.id.blueButton);
        switchScreenWhite = findViewById(R.id.whiteButton);
        switchScreenBlack = findViewById(R.id.blackButton);

        switchScreenBlue.setOnClickListener(
                (view)->
                {
                    moveToNextScreen();
                }

                
        );
        switchScreenWhite.setOnClickListener(
                (view)->
                {
                    moveToNextScreen();
                }
        );
        switchScreenBlack.setOnClickListener(
                (view)->
                {
                    moveToNextScreen();
                }
        );

    }

    public void moveToNextScreen()
    {
        Intent switchActivity = new Intent(this, Talle3_Ac2.class);
        startActivity(switchActivity);
    }
}
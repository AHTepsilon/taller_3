package com.example.taller_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button switchScreenBlue, switchScreenWhite, switchScreenBlack;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = this.getWindow().getDecorView();

        switchScreenBlue = findViewById(R.id.blueButton);
        switchScreenWhite = findViewById(R.id.whiteButton);
        switchScreenBlack = findViewById(R.id.blackButton);

        switchScreenBlue.setOnClickListener(
                (view)->
                {
                    view.setBackgroundResource(R.color.blue);
                    moveToNextScreen();
                }

                
        );
        switchScreenWhite.setOnClickListener(
                (view)->
                {
                    view.setBackgroundResource(R.color.white);
                    moveToNextScreen();
                }
        );
        switchScreenBlack.setOnClickListener(
                (view)->
                {
                    view.setBackgroundResource(R.color.black);
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
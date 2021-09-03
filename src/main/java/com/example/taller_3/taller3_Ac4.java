package com.example.taller_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class taller3_Ac4 extends AppCompatActivity {

    Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller3_ac4);

        returnBtn = findViewById(R.id.returnButton);

        returnBtn.setOnClickListener(
                (view) ->
                {
                    moveToCalculateScreen();
                }
        );
    }

    public void moveToCalculateScreen()
    {
        Intent switchActivity = new Intent(this, Talle3_Ac2.class);
        startActivity(switchActivity);
    }
}
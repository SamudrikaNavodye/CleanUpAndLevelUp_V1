package com.example.cleanupandlevelup_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Intro1 extends AppCompatActivity {

    private ImageButton btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro1);

        btnNext = findViewById(R.id.imgBtnnext1);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actNext = new Intent(getApplicationContext(), Intro2.class);
                startActivity(actNext);
            }
        });

    }
}
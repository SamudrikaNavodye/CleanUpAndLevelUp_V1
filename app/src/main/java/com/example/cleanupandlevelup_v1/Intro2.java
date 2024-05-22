package com.example.cleanupandlevelup_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Intro2 extends AppCompatActivity {

    private ImageButton nextIntro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);

        nextIntro2 = findViewById(R.id.btnNextIntro2);

        nextIntro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Intro3.class);
                startActivity(intent);
            }
        });
    }
}
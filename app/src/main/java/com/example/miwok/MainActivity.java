package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the number category
        TextView number = findViewById(R.id.Numbers);
        //set a clicklistener  on that view
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbers_intent = new Intent(MainActivity.this,Numbers.class);
                // start new activity
                startActivity(numbers_intent);
            }
        });

        // Find the View that shows the color category
        TextView color = findViewById(R.id.Colors);
        //set a clicklistener  on that view
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors_intent = new Intent(MainActivity.this,Colors.class);
                // start new activity
                startActivity(colors_intent);
            }
        });

        // Find the View that shows the Family category
        TextView family = findViewById(R.id.Family);
        //set a clicklistener  on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family_intent = new Intent(MainActivity.this,Family.class);
                // start new activity
                startActivity(family_intent);
            }
        });
        // Find the View that shows the phrases category
        TextView Phrases = findViewById(R.id.Phrases);
        //set a clicklistener  on that view
        Phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbers_intent = new Intent(MainActivity.this,Phrases.class);
                // start new activity
                startActivity(numbers_intent);
            }
        });
    }

}
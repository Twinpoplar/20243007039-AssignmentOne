package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Link to the main layout
        setContentView(R.layout.activity_main);

        // Find the four button containers by their IDs from XML
        LinearLayout btnFacilities = findViewById(R.id.btn_facilities);
        LinearLayout btnEvents = findViewById(R.id.btn_events);
        LinearLayout btnClubs = findViewById(R.id.btn_clubs);
        LinearLayout btnSupport = findViewById(R.id.btn_support);

        // Facilities click -> Pass ID 0
        btnFacilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("TOPIC_ID", 0); // Pass unique identifier
                startActivity(intent);
            }
        });

        // Events click -> Pass ID 1
        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("TOPIC_ID", 1);
                startActivity(intent);
            }
        });

        // Clubs click -> Pass ID 2
        btnClubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("TOPIC_ID", 2);
                startActivity(intent);
            }
        });

        // Support click -> Pass ID 3
        btnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("TOPIC_ID", 3);
                startActivity(intent);
            }
        });
    }
}
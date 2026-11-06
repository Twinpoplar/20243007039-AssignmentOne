package com.example.assignmentone;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Link to the main layout
        setContentView(R.layout.activity_main);

        // 1. Find the four button containers by their IDs from XML
        LinearLayout btnFacilities = findViewById(R.id.btn_facilities);
        LinearLayout btnEvents = findViewById(R.id.btn_events);
        LinearLayout btnClubs = findViewById(R.id.btn_clubs);
        LinearLayout btnSupport = findViewById(R.id.btn_support);

        // 2. Set onClickListeners for each button
        // Facilities click event
        btnFacilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a Toast message
                Toast.makeText(MainActivity.this, "Facilities clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Events click event
        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Events clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Clubs click event
        btnClubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clubs clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Support click event
        btnSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Support clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
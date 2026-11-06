package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout
        setContentView(R.layout.activity_detail);

        // Find all the views
        ImageView detailIcon = findViewById(R.id.detail_icon);
        TextView detailTitle = findViewById(R.id.detail_title);
        TextView detailSubtitle = findViewById(R.id.detail_subtitle);
        TextView detailContent = findViewById(R.id.detail_content);

        // Get the TOPIC_ID from the Intent
        Intent intent = getIntent();
        int topicId = intent.getIntExtra("TOPIC_ID", 0);

        // Get the arrays from arrays.xml
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] imageNames = getResources().getStringArray(R.array.string_array_images);

        // Define the header names (Matches the big text in Figures 6-9)
        // Using an array here avoids if/switch completely!
        String[] headerNames = {"Facilities", "Events", "Clubs", "Support"};

        // Use topicId as the index to get the correct data
        String selectedHeader = headerNames[topicId];        // e.g. "Facilities"
        String selectedTitle = titles[topicId];              // e.g. "Hamilton Facilities"
        String selectedContent = contents[topicId];          // The long text
        String selectedImageName = imageNames[topicId];      // e.g. "img_btn_facilities"

        // Populate the UI
        detailTitle.setText(selectedHeader);   // Big text on the image
        detailSubtitle.setText(selectedTitle); // Bold text in the white area
        detailContent.setText(selectedContent); // Body text

        // Dynamically set the icon
        // trim() removes the spaces around the image name in arrays.xml
        int imageResId = getResources().getIdentifier(selectedImageName.trim(), "drawable", getPackageName());
        if (imageResId != 0) {
            detailIcon.setImageResource(imageResId);
        }
    }
}
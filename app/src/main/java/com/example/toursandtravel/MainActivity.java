package com.example.toursandtravel;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.toursandtravel.R;

public class MainActivity extends AppCompatActivity {

    private EditText destinationInput;
    private EditText dateInput;
    private LinearLayout travelContainer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        destinationInput = findViewById(R.id.destination_input);
        dateInput = findViewById(R.id.date_input);
        travelContainer = findViewById(R.id.travel_container);
    }

    public void bookTravel(View view) {
        String destinationText = destinationInput.getText().toString().trim();
        String dateText = dateInput.getText().toString().trim();

        if (!destinationText.isEmpty() && !dateText.isEmpty()) {
            TextView travelTextView = new TextView(this);
            travelTextView.setText("Destination: " + destinationText + "\nDate: " + dateText);
            travelContainer.addView(travelTextView);
            destinationInput.getText().clear();
            dateInput.getText().clear();
        }
    }
}

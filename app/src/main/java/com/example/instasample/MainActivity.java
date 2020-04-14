package com.example.instasample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //populating spinner with our array
        // Create an ArrayAdapter using the string array and a default spinner layout
        //set default value to the first option
        // Specify the layout to use when the list of choices appears
        // Apply the adapter to the spinner

       Spinner spinner = findViewById(R.id.spinner);
       ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.language, android.R.layout.simple_spinner_item);
        spinner.setSelection(0);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }


}

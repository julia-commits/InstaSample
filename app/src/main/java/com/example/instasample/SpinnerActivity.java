package com.example.instasample;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class SpinnerActivity extends MainActivity implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
        AdapterView parent = null;
        parent.getItemAtPosition(pos);

        //interface implementation
        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}



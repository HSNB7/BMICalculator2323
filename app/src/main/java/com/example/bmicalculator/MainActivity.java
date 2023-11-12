package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.inputmethodservice.AbstractInputMethodService;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etWeight , etHeight ;
   Button  btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectcomponents();
    }

    private void connectcomponents() {
        etWeight = findViewById(R.id.etWeightMain);
        etHeight = findViewById(R.id.etHeightMain);
        Button BTN= findViewById(R.id.btnCalculateMain);
    }

    public void Calculate(View view) {

        String weight = etWeight.getText().toString();
        String height = etHeight.getText().toString();
        if (weight.isEmpty() || !TextUtils.isDigitsOnly(height) || weight.isEmpty() || !TextUtils.isDigitsOnly(weight)) {
            Toast.makeText(this, "Check the Data that u entered!", Toast.LENGTH_SHORT).show();
            
        }
        double  w,h,bmi;
        w = Double.parseDouble(weight);
        h = Double.parseDouble(height);
        bmi = w/(h*h);
        Toast.makeText(this, "Your Bmi is:"+bmi, Toast.LENGTH_LONG).show();

    }
}
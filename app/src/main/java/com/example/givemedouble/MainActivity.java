package com.example.givemedouble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btDoDouble = findViewById(R.id.btDoDouble);
        btDoDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etInput = findViewById(R.id.etInput);
                String input = etInput.getText().toString();
                int inputNumber = Integer.parseInt(input);
                int outputNumber = inputNumber * 2;
                String output = String.valueOf(outputNumber);
                TextView tvOutput = findViewById(R.id.tvOutput);
                tvOutput.setText(output);
            }
        });
    }
}
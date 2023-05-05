package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private Textview textView1;
    private TextView textView3;
    private EditText editTextTextPersonName2;
    private EditText editTextTextPersonName3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        textView3 = findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String w = editTextTextPersonName2.getText().toString();
                double kg = Integer.parseInt(w);
                String h = editTextTextPersonName3.getText().toString();
                double cm = Integer.parseInt(h);
                double m = cm/100;
                double bmi = kg/(m*m);
                if (bmi>=25 && bmi<30){
                    textView3.setText("You're considered overweight :( Work Harder !!" );
                } else if (bmi>=18.5 && bmi<25) {
                    textView3.setText("CONGRATULATIONS !! You're considered healthy :)" );
                } else if (bmi<18.5) {
                    textView3.setText("You're considered underweight :( Eat More !!" );
                }
//                textView3.setText("Your Body-Mass Index is " + bmi );
                Toast.makeText(MainActivity.this, "bmi = " + bmi, Toast.LENGTH_LONG).show();
            }
        });
    }
}
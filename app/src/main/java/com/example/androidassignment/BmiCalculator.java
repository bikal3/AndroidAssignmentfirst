package com.example.androidassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiCalculator extends AppCompatActivity {
EditText height,weight;
Button compute;
Double ansswer;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        compute=findViewById(R.id.computebmi);
        result=findViewById(R.id.txtresult);
//        compute.setOnClickListener(this);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(height.getText().toString());
                Double b = Double.parseDouble(weight.getText().toString());
                ansswer = b/(a*a);
                result.setText(ansswer.toString());
                switch (v.getId()){
                    case R.id.computebmi:
                        if(ansswer<18.5){
                            Toast.makeText(BmiCalculator.this, "Category: Underweight", Toast.LENGTH_SHORT).show();
                        }
                        else if (ansswer>=18.5 && ansswer<=24.9 ){
                            Toast.makeText(BmiCalculator.this, "Category: Normal Weight", Toast.LENGTH_SHORT).show();

                    }
                        else if (ansswer>=25 && ansswer<=29.9){
                            Toast.makeText(BmiCalculator.this, "Category: Overweight", Toast.LENGTH_SHORT).show();
                        }
                        else if(ansswer >=30){
                            Toast.makeText(BmiCalculator.this, "Category: Obesity", Toast.LENGTH_SHORT).show();

                    }
                    break;
                }
            }
        });
    }
}

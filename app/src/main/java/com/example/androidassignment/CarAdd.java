package com.example.androidassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CarAdd extends AppCompatActivity {
EditText make,year,color,purchase,engine;
TextView resultmake,resultyear,resultcolor,resultpurchase,resultengine;
Button  createcar,creatediesel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_add);
        make=findViewById(R.id.et_make);
        year=findViewById(R.id.et_year);
        color=findViewById(R.id.et_color);
        purchase=findViewById(R.id.et_purchase);
        engine=findViewById(R.id.et_engine);

        resultmake=findViewById(R.id.tv_resultmake);
        resultyear=findViewById(R.id.tv_resultyear);
        resultcolor=findViewById(R.id.tv_resultcolor);
        resultpurchase=findViewById(R.id.tv_resultpurchase);
        resultengine=findViewById(R.id.tv_resultengine);

        createcar =findViewById(R.id.btn_createcar);
        creatediesel=findViewById(R.id.btn_creatediesel);

        createcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String maketest=make.getText().toString();
                resultmake.setText("The Vechile is Manufacture by " + make.getText().toString());
                resultyear.setText("Made Year: " +  year.getText().toString());
                resultcolor.setText("Car color: " +   color.getText().toString());
                resultpurchase.setText( "Current value: "+  purchase.getText().toString());
                resultengine.setText("Engine per liter: " + engine.getText().toString());
            }
        });
    }
}

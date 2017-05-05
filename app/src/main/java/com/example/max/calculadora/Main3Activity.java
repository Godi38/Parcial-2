package com.example.max.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    String suma,resta,multiplicacion,division;

    TextView sumaotra;
    TextView restaotra;
    TextView resultadomulti;
    TextView resultadodivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sumaotra = (TextView) findViewById(R.id.resulsuma2);
        restaotra = (TextView) findViewById(R.id.resulresta2);
        resultadomulti = (TextView) findViewById(R.id.resulmulti2);
        resultadodivi = (TextView) findViewById(R.id.resuldivi2);

        suma = getIntent().getStringExtra("suma");
        resta = getIntent().getStringExtra("resta");
        multiplicacion = getIntent().getStringExtra("multiplicacion");
        division = getIntent().getStringExtra("division");

        sumaotra.setText(String.valueOf(suma));
        restaotra.setText(String.valueOf(resta));
        resultadomulti.setText(String.valueOf(multiplicacion));
        resultadodivi.setText(String.valueOf(division));
    }
}

package com.example.max.calculadora;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    TextView resultado;
    EditText numero1;
    EditText numero2;
    Button button2;
    String resultadosu, resultadore, resultadomu, resultadodi;

    float result, valor1, valor2, resultadosuma, resultadoresta, resultadomulti, resultadodivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = (TextView) findViewById(R.id.textView4);
        numero1 = (EditText) findViewById(R.id.editText2);
        numero2 = (EditText) findViewById(R.id.editText);
        radioGroup = (RadioGroup) findViewById(R.id.grupo);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.radioButton4) {
                    valor1 = Integer.parseInt(numero1.getText().toString());
                    valor2 = Integer.parseInt(numero2.getText().toString());
                    result = valor1 + valor2;
                    resultadosuma = result;
                    resultado.setText(String.valueOf(result));

                } else if (checkedId == R.id.radioButton3) {
                    valor1 = Integer.parseInt(numero1.getText().toString());
                    valor2 = Integer.parseInt(numero2.getText().toString());
                    result = valor1 - valor2;
                    resultadoresta = result;
                    resultado.setText(String.valueOf(result));

                } else if (checkedId == R.id.radioButton2) {
                    valor1 = Integer.parseInt(numero1.getText().toString());
                    valor2 = Integer.parseInt(numero2.getText().toString());
                    result = valor1 * valor2;
                    resultadomulti = result;
                    resultado.setText(String.valueOf(result));

                } else if (checkedId == R.id.radioButton) {
                    valor1 = Integer.parseInt(numero1.getText().toString());
                    valor2 = Integer.parseInt(numero2.getText().toString());
                    result = valor1 / valor2;
                    resultadodivi = result;
                    resultado.setText(String.valueOf(result));
                }
            }
        });

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Main3Activity.class);

        if (resultadosuma != 0 & resultadoresta != 0 & resultadomulti != 0 & resultadodivi != 0) {

            resultadosu = String.valueOf(resultadosuma);
            intent.putExtra("suma", resultadosuma + "");

            resultadore = String.valueOf(resultadoresta);
            intent.putExtra("resta", resultadoresta + "");

            resultadomu = String.valueOf(resultadomulti);
            intent.putExtra("multiplicacion", resultadomulti + "");

            resultadodi = String.valueOf(resultadodivi);
            intent.putExtra("division", resultadodivi + "");

            startActivity(intent);

        }
         else Toast.makeText(getApplicationContext(), "Debe seleccionar todas las opciones",Toast.LENGTH_SHORT).show();
        return;
    }
}
package com.example.calculadora;

import android.os.Bundle;

import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText vetnum1, vetnum2, vetres;
    Button vbtsomar, vbtsubtrair, vbtdividir, vbtmultiplicar;

    double num1, num2, res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        vetnum1 = (EditText) findViewById(R.id.et_num1);
        vetnum2 = (EditText) findViewById(R.id.et_num2);
        vetres = (EditText) findViewById(R.id.et_resultado);
        vbtsomar = (Button) findViewById(R.id.bt_somar);
        vbtsubtrair = (Button) findViewById(R.id.bt_subtrair);
        vbtdividir = (Button) findViewById(R.id.bt_dividir);
        vbtmultiplicar = (Button) findViewById(R.id.bt_multiplicar);

        vbtsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(vetnum1.getText().toString());
                num2 = Double.parseDouble(vetnum2.getText().toString());
                res = num1 + num2;
                vetres.setText(String.valueOf(res));
            }
        });

        vbtsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(vetnum1.getText().toString());
                num2 = Double.parseDouble(vetnum2.getText().toString());
                res = num1 - num2;
                vetres.setText(String.valueOf(res));
            }
        });

        vbtdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(vetnum1.getText().toString());
                num2 = Double.parseDouble(vetnum2.getText().toString());
                res = num1 / num2;
                vetres.setText(String.valueOf(res));
            }
        });

        vbtmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(vetnum1.getText().toString());
                num2 = Double.parseDouble(vetnum2.getText().toString());
                res = num1 * num2;
                vetres.setText(String.valueOf(res));
            }
        });
    }
}
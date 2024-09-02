package com.app.mycalcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Operazioni op = new Operazioni();
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.risultato);
    }

    public void somma(View v) {
        EditText pointer_numA = findViewById(R.id.numA);
        EditText pointer_numB = findViewById(R.id.numB);
        String numA_value = String.valueOf(pointer_numA.getText());
        String numB_value = String.valueOf(pointer_numB.getText());
        if (numA_value.isEmpty() == false && numB_value.isEmpty() == false) {
            float risultato = this.op.somma(numA_value, numB_value);
            output.setText(String.valueOf(risultato));
        }
    }

    public void sottrazione(View v) {
        EditText pointer_numA = findViewById(R.id.numA);
        EditText pointer_numB = findViewById(R.id.numB);
        String numA_value = String.valueOf(pointer_numA.getText());
        String numB_value = String.valueOf(pointer_numB.getText());
        if (numA_value.isEmpty() == false && numB_value.isEmpty() == false) {
            float risultato = this.op.sottrazione(numA_value, numB_value);
            output.setText(String.valueOf(risultato));
        }
    }

    public void moltiplicazione(View v) {
        EditText pointer_numA = findViewById(R.id.numA);
        EditText pointer_numB = findViewById(R.id.numB);
        String numA_value = String.valueOf(pointer_numA.getText());
        String numB_value = String.valueOf(pointer_numB.getText());
        if (numA_value.isEmpty() == false && numB_value.isEmpty() == false) {
            float risultato = this.op.moltiplicazione(numA_value, numB_value);
            output.setText(String.valueOf(risultato));
        }
    }

    public void divisione(View v) {
        EditText pointer_numA = findViewById(R.id.numA);
        EditText pointer_numB = findViewById(R.id.numB);
        String numA_value = String.valueOf(pointer_numA.getText());
        String numB_value = String.valueOf(pointer_numB.getText());
        if (numA_value.isEmpty() == false && numB_value.isEmpty() == false) {
            float risultato = this.op.divisione(numA_value, numB_value);
            output.setText(String.valueOf(risultato));
        }
    }
}
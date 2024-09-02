package com.app.mycalcolatrice;

import android.util.Log;

public class Operazioni {

    public float somma(String numA_value, String numB_value) {
        numA_value = numA_value.replace(",", ".");
        numB_value = numB_value.replace(",", ".");
        Log.d("test recupero numA", numA_value);
        Log.d("test recupero numB", numB_value);
        float numA = Float.parseFloat(numA_value);
        float numB = Float.parseFloat(numB_value);
        float numC = numA + numB;
        Log.d("test numA+numB", String.valueOf(numC));
        return numC;
    }

    public float sottrazione(String numA_value, String numB_value) {
        numA_value = numA_value.replace(",", ".");
        numB_value = numB_value.replace(",", ".");
        Log.d("test recupero numA", numA_value);
        Log.d("test recupero numB", numB_value);
        float numA = Float.parseFloat(numA_value);
        float numB = Float.parseFloat(numB_value);
        float numC = numA - numB;
        Log.d("test numA-numB", String.valueOf(numC));
        return numC;
    }

    public float moltiplicazione(String numA_value, String numB_value) {
        numA_value = numA_value.replace(",", ".");
        numB_value = numB_value.replace(",", ".");
        Log.d("test recupero numA", numA_value);
        Log.d("test recupero numB", numB_value);
        float numA = Float.parseFloat(numA_value);
        float numB = Float.parseFloat(numB_value);
        float numC = numA * numB;
        Log.d("test numA*numB", String.valueOf(numC));
        return numC;
    }

    public float divisione(String numA_value, String numB_value) {
        numA_value = numA_value.replace(",", ".");
        numB_value = numB_value.replace(",", ".");
        Log.d("test recupero numA", numA_value);
        Log.d("test recupero numB", numB_value);
        float numA = Float.parseFloat(numA_value);
        float numB = Float.parseFloat(numB_value);
        float numC = numA / numB;
        Log.d("test numA/numB", String.valueOf(numC));
        return numC;
    }

}

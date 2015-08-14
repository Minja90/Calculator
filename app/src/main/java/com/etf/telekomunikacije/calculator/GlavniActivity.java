package com.etf.telekomunikacije.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class GlavniActivity extends Activity {

    Button jedan, dva, tri, cetiri, pet, sest, sedam, osam, devet,nula, brisi, plus, minus, puta, podeljeno;
    EditText textField;
    String a="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glavni_layout);

        jedan = (Button) findViewById(R.id.jedan);
        dva = (Button) findViewById(R.id.dva);
        tri = (Button) findViewById(R.id.tri);
        cetiri = (Button) findViewById(R.id.cetiri);
        pet = (Button) findViewById(R.id.pet);
        sest = (Button) findViewById(R.id.sest);
        sedam = (Button) findViewById(R.id.sedam);
        osam = (Button) findViewById(R.id.osam);
        devet = (Button) findViewById(R.id.devet);
        nula = (Button) findViewById(R.id.nula);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.plus);
        brisi =(Button)findViewById(R.id.brisi);
        puta = (Button)findViewById(R.id.puta);
        podeljeno = (Button)findViewById(R.id.podeljeno);
        textField = (EditText) findViewById(R.id.textField);

    }


    public void klikJedan(View view){
        //textField.setText(a+"1");

        a=textField.getText().toString();
        a=a+"1";
        textField.setText(a);
    }

    public void klikDva(View view){
        //textField.setText(a+"2");

        a=textField.getText().toString();
        a=a+"1";
        textField.setText(a);

    }
    public void klikTri(View view){
        textField.setText(a+"3");
    }
    public void klikCetiri(View view){
        textField.setText("4");
    }
    public void klikPet(View view){
        textField.setText("5");
    }
    public void klikSest(View view){
        textField.setText("6");
    }
    public void klikSedam(View view){
        textField.setText("7");
    }
    public void klikOsam(View view){
        textField.setText("8");
    }
    public void klikDevet(View view){
        textField.setText("9");
    }
    public void klikNula(View view){
        textField.setText("0");
    }
    public void klikPlus(View view){
        textField.setText("+");
    }
    public void klikMinus(View view){
        textField.setText("-");
    }
    public void klikPuta(View view){
        textField.setText("*");
    }
    public void klikPodeljeno(View view){
        textField.setText("/");
    }
    public void klikBrisi(View view){
        textField.setText("");
        textField.invalidate();
    }


}

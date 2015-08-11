package com.etf.telekomunikacije.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class GlavniActivity extends Activity {

    Button jedan, dva, tri, cetiri, pet, sest, sedam, osam, devet,nula, brisi, plus, minus, puta, podeljeno;
    EditText textField;


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


}

package com.example.aplicacion02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNro1, etNro2, etResultado;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir, btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNro1=(EditText) findViewById(R.id.etNro1);
        etNro2=(EditText) findViewById(R.id.etNro2);
        etResultado=(EditText) findViewById(R.id.etResultado);
        btnSumar=(Button) findViewById(R.id.btnSumar);
        btnRestar=(Button) findViewById(R.id.btnRestar);


    }
}
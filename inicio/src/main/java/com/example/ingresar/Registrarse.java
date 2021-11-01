package com.example.ingresar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Registrarse extends AppCompatActivity {

    private EditText etUsuario, etPassword;
    private Button btNewRegister;
    private Spinner spEdad, spEstatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        etUsuario = (EditText) findViewById(R.id.etUser);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btNewRegister = (Button) findViewById(R.id.btNewRegister);
        spEdad = (Spinner) findViewById(R.id.spEdad);
        spEstatura = (Spinner) findViewById(R.id.spEstatura);

        String edad[] = {"Seleccionar", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
        String estatura[] = {"Seleccionar", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167"};

        ArrayAdapter<String> adapterEdad = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                edad);
        spEdad.setAdapter(adapterEdad);

        ArrayAdapter<String> adapterEstatura = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                estatura);
        spEstatura.setAdapter(adapterEstatura);
    }

    public void registrar (View view){
        Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
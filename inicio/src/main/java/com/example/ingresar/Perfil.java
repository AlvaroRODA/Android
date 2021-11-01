package com.example.ingresar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.unity3d.player.UnityPlayerActivity;

public class Perfil extends AppCompatActivity {

    private TextView tvUser, tvEdad, tvEstatura;
    private Button btJugar, btTutoriales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tvUser = (TextView) findViewById(R.id.tvUser);
        tvEdad = (TextView) findViewById(R.id.tvEdad);
        tvEstatura = (TextView) findViewById(R.id.tvEstatura);
        btJugar = (Button) findViewById(R.id.btJugar);
        btTutoriales = (Button) findViewById(R.id.btTutoriales);

        tvUser.setText("Nombre de usuario");
        tvEdad.setText("Edad");
        tvEstatura.setText("Estatura");
    }

    public void jugar(View view){
        Intent intent = new Intent(Perfil.this, UnityPlayerActivity.class);
        startActivity(intent);
    }

    public void tutoriales (View view){
        Intent intent = new Intent(this, Tutoriales.class);
        startActivity(intent);
    }
}
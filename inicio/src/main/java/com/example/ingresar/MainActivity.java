package com.example.ingresar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends AppCompatActivity {

    private Button btLogin, btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = (Button) findViewById(R.id.btLogin);
        btRegister = (Button) findViewById(R.id.btRegister);
    }

    public void ingresar(View view){
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }

    public void registrarse(View view){
        Intent intent = new Intent(this, Registrarse.class);
        startActivity(intent);
    }
}
package com.example.ingresar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unity3d.player.UnityPlayerActivity;

public class Tutoriales extends AppCompatActivity {

    Button btJugarT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoriales);

        btJugarT = (Button) findViewById(R.id.btJugarT);
        btJugarT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tutoriales.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });

    }
}
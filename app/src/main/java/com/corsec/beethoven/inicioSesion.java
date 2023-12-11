package com.corsec.beethoven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class inicioSesion extends AppCompatActivity {
    private TextView tvUsuario;
    private TextView tvContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        tvUsuario = findViewById(R.id.etUsuario);
        tvContraseña = findViewById(R.id.etContraseña);
    }

    public void inicio(View view) {
        Intent intent = new Intent(this, PantallaPrincipal.class);
        startActivity(intent);
    }

    public void volverIn(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
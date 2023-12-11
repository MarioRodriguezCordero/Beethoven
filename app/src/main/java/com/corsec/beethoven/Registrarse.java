package com.corsec.beethoven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registrarse extends AppCompatActivity {
    private TextView tvUsuario;
    private TextView tvEmail;
    private TextView tvContraseña;
    private TextView tvContraseñaOtraVez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        tvUsuario = findViewById(R.id.etUsuarioReg);
        tvEmail = findViewById(R.id.etEmail);
        tvContraseña = findViewById(R.id.etContraseñaReg);
        tvContraseñaOtraVez = findViewById(R.id.etRepContraseña);
    }

    public void volverReg(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void registro(View view) {
        Intent intent = new Intent(this, PantallaPrincipal.class);
        startActivity(intent);
    }
}
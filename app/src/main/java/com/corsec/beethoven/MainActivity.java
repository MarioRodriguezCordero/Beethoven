package com.corsec.beethoven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irseAInicioSesion(View view) {
        Intent intent = new Intent(this, inicioSesion.class);
        startActivity(intent);
    }

    public void irseARegistrarse(View view) {
        Intent intent = new Intent(this, Registrarse.class);
        startActivity(intent);
    }
}
package com.android.alex.guiadeprimerosauxilios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class ActivityPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void salir(View v)
    {
        finish();
    }

    public void quemadura(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityQuemadura.class);
        startActivity(intent);
    }
    public void cardiaco(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityAtaqueCardiaco.class);
        startActivity(intent);
    }
    public void exploracion(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityExploracion.class);
        startActivity(intent);
    }
    public void desmayo(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityDesmayo.class);
        startActivity(intent);
    }
    public void envenenamiento(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityEnvenenamiento.class);
        startActivity(intent);
    }
    public void herida(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityHeridasProfundas.class);
        startActivity(intent);
    }
    public void alergia(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityReaccionesAlergicas.class);
        startActivity(intent);
    }
    public void sofocacion(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivitySofocacion.class);
        startActivity(intent);
    }
    public void dentales(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityProblemasDentales.class);
        startActivity(intent);
    }
    public void esguince(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityEsguince.class);
        startActivity(intent);
    }
    public void electrocucion(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityElectrocucion.class);
        startActivity(intent);
    }
    public void venda(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityVendas.class);
        startActivity(intent);
    }
    public void mordedura(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityMordedura.class);
        startActivity(intent);
    }
    public void respiracion(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityBocaABoca.class);
        startActivity(intent);
    }
    public void rcp(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityRCP.class);
        startActivity(intent);
    }
    public void oftalmologica(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityOftalmologica.class);
        startActivity(intent);
    }
    public void botiquin(View view)
    {
        Intent intent = new Intent(ActivityPrincipal.this,ActivityBotiquin.class);
        startActivity(intent);
    }

}


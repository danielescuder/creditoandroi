package com.example.credito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenusActivity extends AppCompatActivity {

    TextView jtvusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
        //Ocultar la barra de menu y voy a mostrar en un textView el usuario
        //de la actividad pasada
        getSupportActionBar().hide();
        jtvusuario=findViewById(R.id.tvusuario);
        String usuario;
        usuario=getIntent().getStringExtra("datos");
        jtvusuario.setText(usuario);
    }

    public void Creditos(View view){
        Intent intcredito=new Intent(this,CreditoActivity.class);
        startActivity(intcredito);
    }

    public void Usuarios(View view){
        Intent intusuarios=new Intent(this,UsuarioActivity.class);
        startActivity(intusuarios);
    }

    public void Salir(View view){
        Intent intmain=new Intent(this,MainActivity.class);
        startActivity(intmain);
    }

}
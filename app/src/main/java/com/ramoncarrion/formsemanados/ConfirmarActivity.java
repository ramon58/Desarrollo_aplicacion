package com.ramoncarrion.formsemanados;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmarActivity extends AppCompatActivity {

    private TextView textNombre, textFecha, textTelefono, textEmail, textDescripcion;
    Button btEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        textNombre = (TextView) findViewById(R.id.tvNombre);
        textFecha = (TextView) findViewById(R.id.tvFecha);
        textTelefono = (TextView) findViewById(R.id.tvTelefono);
        textEmail = (TextView) findViewById(R.id.tvEmail);
        textDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        btEditar = (Button) findViewById(R.id.btEditarDatos);

        btEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        String nombre = getIntent().getStringExtra("nombre");
        String fecha = getIntent().getStringExtra("fecha");
        String telefono = getIntent().getStringExtra("telefono");
        String email = getIntent().getStringExtra("email");
        String descripcion = getIntent().getStringExtra("descripcion");

        textNombre.setText(nombre);
        textFecha.setText (fecha);
        textTelefono.setText (telefono);
        textEmail.setText(email);
        textDescripcion.setText(descripcion);

    }
}
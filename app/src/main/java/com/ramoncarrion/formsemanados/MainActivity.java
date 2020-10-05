package com.ramoncarrion.formsemanados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btconfirmar_datos;
    DatePicker picker;
    Button btFecha;

    private EditText nombre, telefono, email, descripcion, fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btFecha=(Button)findViewById(R.id.btSelectFecha);
        btconfirmar_datos = (Button) findViewById(R.id.btConfirmarDatos);
        nombre = (EditText) findViewById(R.id.etNombre);
        fecha = (EditText) findViewById(R.id.etFecha);
        picker=(DatePicker)findViewById(R.id.dpPicker);
        telefono = (EditText) findViewById(R.id.etTelefono);
        email = (EditText) findViewById(R.id.etEmail);
        descripcion = (EditText) findViewById(R.id.etDescripcion);

        btFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fecha.setText(picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear());
            }
        });

        btconfirmar_datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ConfirmarActivity.class);
                intent.putExtra("nombre", nombre.getText()+"");
                intent.putExtra("fecha", fecha.getText()+"");
                intent.putExtra("telefono", telefono.getText()+"");
                intent.putExtra("email", email.getText()+"");
                intent.putExtra("descripcion", descripcion.getText()+"");
                    startActivity(intent);
                }

        });

    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cajaNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaNumero = findViewById(R.id.cajaNum);

    }

    public void BottonGuardar(View view){

        String contenido = cajaNumero.getText().toString();

        if (contenido.isEmpty())
            Toast.makeText(this, "Debe ingresar un número", Toast.LENGTH_SHORT).show();

        else{
                int numeroFinal = Integer.parseInt(contenido);
                
                if (numeroFinal <=0)
                    Toast.makeText(this, "Debe ingresar un número mayor que 0", Toast.LENGTH_SHORT).show();

                else if (numeroFinal > 1000)
                    Toast.makeText(this, "Debe ingresar un número menor que 1000", Toast.LENGTH_SHORT).show();

                else
                    Toast.makeText(this, "El número se guardó: " + numeroFinal, Toast.LENGTH_SHORT).show();

            }
    }
}

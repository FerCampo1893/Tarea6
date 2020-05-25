package com.uisrael.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Actividad3 extends AppCompatActivity {

    Bundle datoRecibirP1;
    TextView recibirP1;


    Bundle datoRecibirP2;
    TextView recibirP2;


    Bundle datoRecibirP3;
    TextView recibirP3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        recibirP1 = findViewById(R.id.etReciveP1);
        datoRecibirP1= getIntent().getExtras(); // obetengo el dato
        String RecibirDato1 = datoRecibirP1.getString("datoEnviado1");
        recibirP1.setText(RecibirDato1);//envio a la caja de texto


        recibirP2 = findViewById(R.id.etReciveP2);
        datoRecibirP2= getIntent().getExtras(); // obetengo el dato
        String RecibirDato2 = datoRecibirP2.getString("datoEnviado2");
        recibirP2.setText(RecibirDato2);//envio a la caja de texto



        recibirP3 = findViewById(R.id.etReciveP3);
        datoRecibirP3= getIntent().getExtras(); // obetengo el dato
        String RecibirDato3 = datoRecibirP3.getString("datoEnviado5");
        recibirP3.setText(RecibirDato3);//envio a la caja de texto





    }


}

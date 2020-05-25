package com.uisrael.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {
    Bundle datoRecibir;
    TextView recibir;
    EditText p3,p1,p2;
    String str;

    CheckBox cb1,cb2;
    RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        recibir = findViewById(R.id.etReciveUsuario);
        datoRecibir= getIntent().getExtras(); // obetengo el dato
        String RecibirDato = datoRecibir.getString("datoEnviado");
        recibir.setText(RecibirDato);//envio a la caja de texto

        rb1=findViewById(R.id.rbOpcion1);
        rb2=findViewById(R.id.rbOpcion2);

        cb1= findViewById(R.id.cbOpcion1);
        cb2= findViewById(R.id.cbOpcion2);

        p3 = findViewById(R.id.txtP3);


    }

    public void VerificarDatosP1 (View v){


            Intent objEnvio1 = new Intent(this,Actividad3.class );
            if(rb1.isChecked()==true){
                objEnvio1.putExtra("datoEnviado1","Opcion: "+rb1.getText().toString());
            }else{
                objEnvio1.putExtra("datoEnviado1","Opcion: "+rb2.getText().toString());
            }
            startActivity(objEnvio1);


            Intent objEnvio2 = new Intent(this,Actividad3.class );
            if (cb1.isChecked()==true && cb2.isChecked()==true){
                objEnvio2.putExtra("datoEnviado2","Selecciono las 2 opciones");
            }else if(cb1.isChecked()==true){
                objEnvio2.putExtra("datoEnviado2",cb1.getText().toString());
            }else if (cb2.isChecked()==true) {
                objEnvio2.putExtra("datoEnviado2",cb2.getText().toString());
            }
            startActivity(objEnvio2);


            Intent objEnvio4 = new Intent(this,Actividad3.class );
            objEnvio4.putExtra("datoEnviado5",p3.getText().toString());
            startActivity(objEnvio4);


    }


}

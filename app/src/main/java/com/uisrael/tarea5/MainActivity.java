package com.uisrael.tarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUs, etClv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUs = findViewById(R.id.etUsuario);
        etClv = findViewById(R.id.etClave);
    }

    public void VerificarDatos (View v){

        if(etUs.getText().toString().equals("HUGOCAMPO") && etClv.getText().toString().equals("uisrael.2020")){
            Toast.makeText(getApplicationContext(),"DATOS CORRECTOS",Toast.LENGTH_LONG).show();

            Intent objEnvio = new Intent(this,Actividad2.class );
            objEnvio.putExtra("datoEnviado", etUs.getText().toString());

           startActivity(objEnvio);

        }else{
            Toast.makeText(getApplicationContext(),"DATOS INCORRECTOS",Toast.LENGTH_LONG).show();
        }



    }


}

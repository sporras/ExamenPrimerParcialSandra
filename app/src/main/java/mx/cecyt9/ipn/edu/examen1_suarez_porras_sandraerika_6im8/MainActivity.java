package mx.cecyt9.ipn.edu.examen1_suarez_porras_sandraerika_6im8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    EditText cantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidad= (EditText) findViewById(R.id.cantidad);
    }



    public void onClickConvertir(View myView){


    try{
        if(!cantidad.getText().toString().equals("")){
            Intent intento1 =  new Intent(this, Actividad2.class);
            Double pesos = Double.parseDouble(cantidad.getText().toString());
            Double resultado=pesos/15;
            Bundle resultadoDiv = new Bundle();
            resultadoDiv.putDouble("resultado", resultado);
            intento1.putExtras(resultadoDiv);
            finish();
            startActivity(intento1);
        }else{
            Toast.makeText(this, "Introduce un numero", LENGTH_SHORT).show();
        }
    }catch(Exception e){
        Toast.makeText(this, "Introduce solo numeros", LENGTH_SHORT).show();
    }

    }
}

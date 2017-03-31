package mx.cecyt9.ipn.edu.examen1_suarez_porras_sandraerika_6im8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {
    TextView entrada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);



        try{
            entrada = (TextView) findViewById(R.id.resultado);
            Bundle recibeParametro = new Bundle();
            recibeParametro=this.getIntent().getExtras();
            Double recibiendoParam = recibeParametro.getDouble("resultado");
            entrada.setText("Suárez Porras Sandra Erika" + "" + recibiendoParam);
        }catch(Exception e){
            entrada.setText(e.getMessage());
        }

    }

    public void onClickEnviarEmail(View env)
    {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "EXAMEN 1er PARCIAL");
            intent.putExtra(Intent.EXTRA_TEXT, entrada.getText().toString());
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"eoropezag@ipn.mx"});
            startActivity(intent);
        }catch (Exception e)
        {

            entrada.setText(e.getMessage());

        }
    }
}

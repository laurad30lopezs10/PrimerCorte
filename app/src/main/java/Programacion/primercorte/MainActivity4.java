package Programacion.primercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
private Switch ComprobarMasajesR;
private TextView MensajeMasajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ComprobarMasajesR=(Switch) findViewById(R.id.SwicthReglas);
        MensajeMasajes=(TextView)findViewById(R.id.TextoMasajesRelas);

    }
    public void SwichColor(View v){
        MensajeMasajes.setTextColor(Color.GREEN);
    }

}
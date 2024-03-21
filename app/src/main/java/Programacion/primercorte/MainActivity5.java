package Programacion.primercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private RadioButton verificarRglas;
    private TextView ReglasSauna;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        verificarRglas=(RadioButton) findViewById(R.id.radioButtonSauna);
        ReglasSauna=(TextView) findViewById(R.id.TextoReglasSauna);
    }
    public void ButtonColor(View v){
        ReglasSauna.setTextColor(Color.GREEN);
    }
}
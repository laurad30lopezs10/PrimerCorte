package Programacion.primercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private  RadioGroup Edades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }
    public void comprobarModoPago(View view) {
        if (Edades.getCheckedRadioButtonId() == R.id.radioMenores) {
            final String text = "Recuerda venir con el acompañamiento de un adulto";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();}}

    public void ButtonPiscina(View v){
        Intent linear=new Intent(this,MainActivity3.class);
        startActivity(linear);

    }

    public void Buttonmasajes(View v){
        Intent linear=new Intent(this,MainActivity4.class);
        startActivity(linear);

    }

    public void ButtonSauna(View v){
        Intent linear=new Intent(this,MainActivity5.class);
        startActivity(linear);

    }

    }


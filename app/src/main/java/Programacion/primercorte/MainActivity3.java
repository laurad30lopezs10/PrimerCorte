package Programacion.primercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private CheckBox piscina;
    private TextView piscinatext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
TextView Piscinatext=(TextView) findViewById(R.id.ReglasPrincipalText);
        piscina=(CheckBox)findViewById(R.id.checkBoxReglas);
        piscina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piscinatext.setTextColor(Color.GREEN);
            }
        });
    }

}
package Programacion.primercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TextoRegistro;
   private TextView TextoEmail;
   private EditText EmailAddress;
   private CheckBox EmailCheck;
   private TextView Crearpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextoRegistro = ( TextView) findViewById(R.id.TextoRegistro);
        TextoRegistro.setTextSize( 30);
        TextoRegistro.setTextColor(Color.BLUE);
        System.out.println(TextoRegistro.getText().toString());
        TextoRegistro.setText("Register below");

        TextoEmail = ( TextView) findViewById(R.id.TextoEmail);
        TextoEmail.setTextSize( 30);
        TextoEmail.setTextColor(Color.RED);
        System.out.println(TextoEmail.getText().toString());
        TextoEmail.setText("Enter your e-mail address");

        EmailAddress=(EditText) findViewById(R.id.EmailAddress);
        EmailAddress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                TextoEmail.setTextColor(Color.GREEN);
            }
    });

EmailCheck=(CheckBox)findViewById(R.id.checkEmail);
EmailCheck.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        TextoEmail.setTextColor(Color.GREEN);
    }
});
        Crearpassword = ( TextView) findViewById(R.id.textopassword);
        Crearpassword.setTextSize( 30);
        Crearpassword.setTextColor(Color.RED);
        System.out.println(Crearpassword.getText().toString());
        Crearpassword.setText("Create a password");


        }
    }


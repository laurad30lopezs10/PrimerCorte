package Programacion.primercorte;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView TextoRegistro;
   private TextView TextoEmail;
   private EditText EmailAddress;
   private CheckBox EmailCheck;
   private TextView Crearpassword;
   private TextView guardarEmail;
   private TextView guardasPassword;
private EditText passwordcreado;
private ImageButton MenuOpcionesPlus;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextoRegistro = ( TextView) findViewById(R.id.TextoRegistro);
        TextoRegistro.setTextSize( 30);
        TextoRegistro.setTextColor(Color.MAGENTA);
        System.out.println(TextoRegistro.getText().toString());
        TextoRegistro.setText("Register below");

        TextoEmail = ( TextView) findViewById(R.id.TextoEmail);
        TextoEmail.setTextSize( 30);
        TextoEmail.setTextColor(Color.MAGENTA);
        System.out.println(TextoEmail.getText().toString());
        TextoEmail.setText("Enter your e-mail address");

        guardarEmail = ( TextView) findViewById(R.id.showemail);
        guardarEmail.setTextSize( 30);
        guardarEmail.setTextColor(Color.MAGENTA);
        System.out.println(guardarEmail.getText().toString());
        guardarEmail.setText("There are no registered emails");


        guardasPassword = ( TextView) findViewById(R.id.ShowPassword);
        guardasPassword .setTextSize( 30);
        guardasPassword .setTextColor(Color.MAGENTA);
        System.out.println(guardasPassword .getText().toString());
        guardasPassword .setText("There are no password created");

        passwordcreado=(EditText) findViewById(R.id.password);
        passwordcreado.addTextChangedListener((new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Crearpassword.setTextColor(Color.YELLOW);
            }
        }));

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
                TextoEmail.setTextColor(Color.YELLOW);
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
        Crearpassword.setTextColor(Color.MAGENTA);
        System.out.println(Crearpassword.getText().toString());
        Crearpassword.setText("Create a password");

MenuOpcionesPlus=(ImageButton)findViewById(R.id.MenuOpciones);
MenuOpcionesPlus.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        popupMenuAcciones();
    }
});

        }
        public void cambiarColor(View V){
            TextoEmail.setTextColor(Color.GREEN);

        }
    public void Verpassword(View V){
        Crearpassword.setTextColor(Color.GREEN);
    }
public void TerminarRegistro(View v){
    guardarEmail.setText(EmailAddress.getText().toString());
    guardarEmail.setTextColor(Color.GREEN);
    guardasPassword.setText(passwordcreado.getText().toString());
    guardasPassword.setTextColor(Color.GREEN);
}

public void popupMenuAcciones(){
    PopupMenu pop = new PopupMenu(this,MenuOpcionesPlus);
    pop.getMenuInflater().inflate(R.menu.menopopup, pop.getMenu());
    pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            Toast.makeText(getBaseContext(),item.getTitle().toString(),Toast.LENGTH_LONG).show();
            return false;
        }
    });
    pop.show();
}

    }


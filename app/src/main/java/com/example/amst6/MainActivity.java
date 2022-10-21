package com.example.amst6;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class MainActivity extends AppCompatActivity {
    private EditText txtNombre, txtApellido, txtUsuario, txtPasswd;
    private Button btnLogin, btnRegistro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Referencias a los controles
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtPasswd = (EditText) findViewById(R.id.txtPasswd);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistro = (Button) findViewById(R.id.btnRegistro);

        map.put("rcadena","123456");
        map.put("tangelo","123456");
        map.put("admin","admin");

    }
    public void registrarse(View view) {
        Intent intent = new Intent(this, formulario_registro.class);

        startActivity(intent);
        map.put(String.valueOf(txtUsuario.getText()),String.valueOf(txtPasswd.getText()));
    }
    public void login(View view) throws InterruptedException {
        String usuario = String.valueOf(txtUsuario.getText());
        String clave = String.valueOf(txtPasswd.getText());
        String clave_ve= map.get(usuario);
        if (!usuario.isEmpty()) {
            if (clave.equals(clave_ve)) {
                Toast toast = Toast.makeText(getApplicationContext(), "Success!", Toast.LENGTH_SHORT);
                toast.show();
                TimeUnit.SECONDS.sleep(1);
                Intent intent = new Intent(this, navigation.class);

                startActivity(intent);
            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "Usted no cuenta con un usuario", Toast.LENGTH_SHORT);
                toast.show();
            }
        }

    }
    public void onClick(View v) {
        if(v.getId()==R.id.btnLogin){
            Log.d("mensaje","ïngreso");
        }else if(v.getId() == R.id.btnRegistro) {
        }
    }
        public void navigation(View view) {

    }

    public Map<String, String> map = new HashMap<String, String>();
}
package com.example.josue.tachosproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginAct extends AppCompatActivity {

    Button btnLogin;
    TextView tvLogEmail, tvLogPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvLogEmail = (TextView) findViewById(R.id.edt_usuario);
        tvLogPassword = (TextView) findViewById(R.id.edt_contraseña);
        btnLogin = (Button) findViewById(R.id.btn_inSesion);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ingresar();
            }

        });


    }

    private void Ingresar() {
        Intent LogIn = new Intent(LoginAct.this, MenuAct.class);
        startActivity(LogIn);
    }
}

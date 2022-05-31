package com.example.ta_pam;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.net.Uri;
import android.os.Bundle;

public class login_activity extends AppCompatActivity {

    Button btnLogin;
    EditText usrnm,pass;
    TextView rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin=findViewById(R.id.btn_login);
        usrnm=findViewById(R.id.et_username);
        pass=findViewById(R.id.et_password);
        rg=findViewById(R.id.tv_rg);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usrnm.getText().toString();
                String password = pass.getText().toString();
                if (username.equals("salsabila") && password.equals("123")) {
                    Toast.makeText(login_activity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();

                    Intent login=new Intent(login_activity.this, MainActivity.class);
                    startActivity(login);
                } else {
                    Toast.makeText(login_activity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis=new Intent(login_activity.this, register_activity.class);
                startActivity(regis);
            }
        });


    }
}
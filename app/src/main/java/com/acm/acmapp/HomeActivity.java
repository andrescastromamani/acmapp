package com.acm.acmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    EditText name, email, address;
    Spinner deptos;
    RadioButton full, halftime;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        address = findViewById(R.id.address);
        deptos = findViewById(R.id.deptos);
        full = findViewById(R.id.full);
        halftime = findViewById(R.id.halftime);
        btnSave = findViewById(R.id.btnsave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().equals("") || email.getText().toString().equals("")){
                    Toast.makeText(HomeActivity.this,"Ingrese su nombre y correo electronico", Toast.LENGTH_LONG).show();
                }else {
                    Intent intent = new Intent(HomeActivity.this,AboutActivity.class);
                    intent.putExtra("name",name.getText().toString());
                    intent.putExtra("email",email.getText().toString());
                    intent.putExtra("address",address.getText().toString());
                    intent.putExtra("deptos",deptos.getSelectedItem().toString());
                    String timeTable = "";
                    if (full.isChecked()){
                        timeTable = "Tiempo Completo";
                    }else{
                        timeTable = "Medio Tiempo";
                    }
                    intent.putExtra("timetable",timeTable);
                    startActivity(intent);
                }
            }
        });
    }
}
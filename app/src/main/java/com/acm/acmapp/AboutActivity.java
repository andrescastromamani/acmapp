package com.acm.acmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    EditText txtName;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        txtName = findViewById(R.id.txtName);
        txtView = findViewById(R.id.txtView);

        String datos = "Email: "+getIntent().getStringExtra("email")
                +"\nDireccion:"+getIntent().getStringExtra("address")+"\nDepartamentos: "+getIntent().getStringExtra("deptos")
                +"\nHorario: "+getIntent().getStringExtra("timetable");
        txtName.setText(getIntent().getStringExtra("name"));
        txtView.setText(datos);
    }
}
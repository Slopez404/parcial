package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.parcial.db.BaseHelper;

public class Activity2 extends AppCompatActivity {

    Button btn_crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btn_crear = findViewById(R.id.btn_crear);

        btn_crear.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                BaseHelper baseHelper = new BaseHelper(Activity2.this);
                SQLiteDatabase db = baseHelper.getWritableDatabase(); //
                if (db != null) {

                } else
                    Toast.makeText(Activity2.this, "No se pudo crear la Base de Datos", Toast.LENGTH_LONG).show();
            }
        });
    }
}



package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button toplamaSayfasiButtonu;
    Button cikarmaSayfasiButtonu;
    Button carpmaSayfasiButtonu;
    Button bolmeSayfasiButtonu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toplamaSayfasiButtonu=findViewById(R.id.btn_topla);

        //toplama sayfasına geçiş
        toplamaSayfasiButtonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(MainActivity.this, ToplaActivity.class)});


            }


        });
        cikarmaSayfasiButtonu=findViewById(R.id.btn_cikar);

        //çıkarma sayfasına geçiş
        cikarmaSayfasiButtonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(MainActivity.this, CikarActivity.class)});


            }


        });

        carpmaSayfasiButtonu=findViewById(R.id.btn_carp);

        //çarpma sayfasına geçiş
        carpmaSayfasiButtonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(MainActivity.this, CarpActivity.class)});


            }


        });

        bolmeSayfasiButtonu=findViewById(R.id.btn_bol);

        //bölme sayfasına geçiş
        bolmeSayfasiButtonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(MainActivity.this, BolActivity.class)});


            }


        });


    }
}
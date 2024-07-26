package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CarpActivity extends AppCompatActivity {

    EditText edtsayibir;
    EditText edtsayiiki;
    Button btnCarp;
    TextView txtSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carp);

        edtsayibir = findViewById(R.id.edt_sayi1);
        edtsayiiki = findViewById(R.id.edt_sayi2);
        btnCarp = findViewById(R.id.btn_carp2);
        txtSonuc = findViewById(R.id.txt_sonuc);

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sayibirStr = edtsayibir.getText().toString();
                String sayiikiStr = edtsayiiki.getText().toString();

                if (sayibirStr.isEmpty() || sayiikiStr.isEmpty()) {
                    Toast.makeText(CarpActivity.this, "Lütfen her iki sayıyı da girin", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double sayibir = Double.parseDouble(sayibirStr);
                    double sayiiki = Double.parseDouble(sayiikiStr);

                    double carpim = sayibir * sayiiki;
                    String formattedCarp = String.format("%.2f", carpim);
                    txtSonuc.setText(formattedCarp);
                } catch (NumberFormatException e) {
                    Toast.makeText(CarpActivity.this, "Geçersiz sayı formatı", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

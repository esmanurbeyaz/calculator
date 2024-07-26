package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CikarActivity extends AppCompatActivity {

    EditText edtsayibir;
    EditText edtsayiiki;
    Button btnCikar;
    TextView txtSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cikar);

        edtsayibir = findViewById(R.id.edt_sayi1);
        edtsayiiki = findViewById(R.id.edt_sayi2);
        btnCikar = findViewById(R.id.btn_cikar2);
        txtSonuc = findViewById(R.id.txt_sonuc);

        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sayibirStr = edtsayibir.getText().toString();
                String sayiikiStr = edtsayiiki.getText().toString();

                if (sayibirStr.isEmpty() || sayiikiStr.isEmpty()) {
                    Toast.makeText(CikarActivity.this, "Lütfen her iki sayıyı da girin", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double sayibir = Double.parseDouble(sayibirStr);
                    double sayiiki = Double.parseDouble(sayiikiStr);

                    double fark = sayibir - sayiiki;
                    String formattedCikar = String.format("%.2f", fark);
                    txtSonuc.setText(formattedCikar);
                } catch (NumberFormatException e) {
                    Toast.makeText(CikarActivity.this, "Geçersiz sayı formatı", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

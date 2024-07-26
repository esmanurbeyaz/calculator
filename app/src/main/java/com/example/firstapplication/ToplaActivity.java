package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ToplaActivity extends AppCompatActivity {

    EditText edtsayibir;
    EditText edtsayiiki;
    Button btnTopla;
    TextView txtSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topla);

        edtsayibir = findViewById(R.id.edt_sayi1);
        edtsayiiki = findViewById(R.id.edt_sayi2);
        btnTopla = findViewById(R.id.btn_topla2);
        txtSonuc = findViewById(R.id.txt_sonuc);

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sayibirStr = edtsayibir.getText().toString();
                String sayiikiStr = edtsayiiki.getText().toString();

                if (sayibirStr.isEmpty() || sayiikiStr.isEmpty()) {
                    Toast.makeText(ToplaActivity.this, "Lütfen her iki sayıyı da girin", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double sayibir = Double.parseDouble(sayibirStr);
                    double sayiiki = Double.parseDouble(sayiikiStr);

                    double toplam = sayibir + sayiiki;
                    String formattedToplam = String.format("%.2f", toplam);
                    txtSonuc.setText(formattedToplam);
                } catch (NumberFormatException e) {
                    Toast.makeText(ToplaActivity.this, "Geçersiz sayı formatı", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

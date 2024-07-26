package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BolActivity extends AppCompatActivity {

    EditText edtsayibir;
    EditText edtsayiiki;
    Button btnBol;
    TextView txtSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bol);

        edtsayibir = findViewById(R.id.edt_sayi1);
        edtsayiiki = findViewById(R.id.edt_sayi2);
        btnBol = findViewById(R.id.btn_bol2);
        txtSonuc = findViewById(R.id.txt_sonuc);

        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sayibirStr = edtsayibir.getText().toString();
                String sayiikiStr = edtsayiiki.getText().toString();

                if (sayibirStr.isEmpty() || sayiikiStr.isEmpty()) {
                    Toast.makeText(BolActivity.this, "Lütfen her iki sayıyı da girin", Toast.LENGTH_SHORT).show();
                    return;
                }


                try {
                    double sayibir = Double.parseDouble(sayibirStr);
                    double sayiiki = Double.parseDouble(sayiikiStr);

                    if (sayiiki==0) {
                        Toast.makeText(BolActivity.this, "ikinci sayı 0 olamaz", Toast.LENGTH_SHORT).show();
                        return;
                    }


                    double bolum = sayibir / sayiiki;
                    String formattedBol = String.format("%.2f", bolum);
                    txtSonuc.setText(formattedBol);
                } catch (NumberFormatException e) {
                    Toast.makeText(BolActivity.this, "Geçersiz sayı formatı", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

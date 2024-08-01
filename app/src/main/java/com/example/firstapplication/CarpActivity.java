package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CarpActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPoint, btnClear, btnDel, btnTimes, btnBack;
    EditText edtNumber1, edtNumber2, currentEditText;
    TextView txtResault;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cikar);

        edtNumber1 = findViewById(R.id.edit_1);
        edtNumber2 = findViewById(R.id.edit_2);

        btn1 = (Button) findViewById(R.id.number1);
        btn2 = (Button) findViewById(R.id.number2);
        btn3 = (Button) findViewById(R.id.number3);
        btn4 = (Button) findViewById(R.id.number4);
        btn5 = (Button) findViewById(R.id.number5);
        btn6 = (Button) findViewById(R.id.number6);
        btn7 = (Button) findViewById(R.id.number7);
        btn8 = (Button) findViewById(R.id.number8);
        btn9 = (Button) findViewById(R.id.number9);
        btn0 = (Button) findViewById(R.id.number0);
        btnPoint = (Button) findViewById(R.id.point);
        btnClear = (Button) findViewById(R.id.clear);
        btnDel = (Button) findViewById(R.id.delete);
        btnTimes = (Button) findViewById(R.id.divide);
        btnBack = (Button) findViewById(R.id.Back);

        txtResault = findViewById(R.id.resault);

        edtNumber1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    currentEditText = edtNumber1;
                }
            }
        });

        edtNumber2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    currentEditText = edtNumber2;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("1");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("1");
                    }
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("2");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("2");
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("3");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("3");
                    }
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("4");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("4");
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("5");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("5");
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("6");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("6");
                    }
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("7");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("7");
                    }
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("8");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("8");
                    }
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("9");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("9");
                    }
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append("0");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append("0");
                    }
                }
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    if (currentEditText == edtNumber1) {
                        currentEditText.append(".");
                    } else if (currentEditText == edtNumber2) {
                        currentEditText.append(".");
                    }
                }
            }
        });
        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sayibirStr = edtNumber1.getText().toString();
                String sayiikiStr = edtNumber2.getText().toString();

                if (sayibirStr.isEmpty() || sayiikiStr.isEmpty()) {
                    Toast.makeText(CarpActivity.this, "Lütfen her iki sayıyı da girin", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double sayibir = Double.parseDouble(sayibirStr);
                    double sayiiki = Double.parseDouble(sayiikiStr);

                    double carpim = sayibir * sayiiki;
                    String formattedCarp = String.format("%.2f", carpim);
                    txtResault.setText(formattedCarp);
                } catch (NumberFormatException e) {
                    Toast.makeText(CarpActivity.this, "Geçersiz sayı formatı", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber1.setText("");
                edtNumber2.setText("");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentEditText != null) {
                    String text = currentEditText.getText().toString();
                    if (text.length() > 0) {
                        currentEditText.setText(text.substring(0, text.length() - 1));
                        currentEditText.setSelection(currentEditText.getText().length());
                    }
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    /*
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
        */

    }
}

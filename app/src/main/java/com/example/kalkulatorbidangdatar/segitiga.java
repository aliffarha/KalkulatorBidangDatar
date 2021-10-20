package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga extends AppCompatActivity {


    private EditText txtAlas;

    private EditText txtTinggi;

    private EditText txtSisi;

    private EditText txtLuaskeliling;

    private Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        txtAlas = (EditText) findViewById(R.id.txtAlas);
        txtTinggi = (EditText) findViewById(R.id.txtTinggi);
        txtSisi = (EditText) findViewById(R.id.txtSisi);

        txtLuaskeliling = (EditText) findViewById(R.id.txtLuaskeliling);
        btnHitung = (Button) findViewById(R.id.btnHitung);
    }
    public void hitungLuas(View view) {

        try {
            int alas = Integer.parseInt(txtAlas.getText().toString());
            int tinggi = Integer.parseInt(txtTinggi.getText().toString());
            int luas = (alas * tinggi) / 2;
            txtLuaskeliling.setText(String.valueOf(luas));

        } catch

        (Exception e) {
            e.printStackTrace();
        }
    }

    public void hitungKeliling(View view) {
        try {
            int alas = Integer.parseInt(txtAlas.getText().toString());
            int tinggi = Integer.parseInt(txtTinggi.getText().toString());
            int sisi = Integer.parseInt(txtSisi.getText().toString());
            int keliling = alas + tinggi + sisi ;
            txtLuaskeliling.setText(String.valueOf(keliling));

        } catch

        (Exception e) {
            e.printStackTrace();
        }

    }
    public void Pindah1(View view) {
        Intent intent = new Intent(segitiga.this,MainActivity.class);
        startActivity(intent);
    }
}

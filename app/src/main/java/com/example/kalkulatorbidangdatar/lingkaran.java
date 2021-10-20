package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class lingkaran extends AppCompatActivity {

    private EditText txtJari;

    private EditText txtLuaskeliling;

    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        txtJari = (EditText) findViewById(R.id.txtJari);


        txtLuaskeliling = (EditText) findViewById(R.id.txtLuaskeliling);
        btnHitung = (Button) findViewById(R.id.btnHitung);


    }

        public void hitungLuas(View view) {

            try {

                int jarijari = Integer.parseInt(txtJari.getText().toString());
                double phi = 3.14;
                double luas = phi * jarijari * jarijari;

                txtLuaskeliling.setText(String.valueOf(luas));
            } catch
            (Exception e) {

                e.printStackTrace();
            }

        }


        public  void hitungKeliling(View view){
            try {

                int jarijari = Integer.parseInt(txtJari.getText().toString());
                double phi = 3.14;
                double keliling = phi * 2 * jarijari;

                txtLuaskeliling.setText(String.valueOf(keliling));
            } catch
            (Exception e) {

                e.printStackTrace();
            }

        }



    public void Pindah(View view) {
        Intent intent = new Intent(lingkaran.this,MainActivity.class);
        startActivity(intent);
    }
}
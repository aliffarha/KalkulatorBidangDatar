package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class persegipanjang extends AppCompatActivity {

    private EditText txtPanjang;

    private EditText txtLebar;

    private EditText txtLuaskeliling;

    private Button btnHitung;


@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_persegipanjang);
    txtPanjang = (EditText) findViewById(R.id.txtPanjang);
    txtLebar = (EditText) findViewById(R.id.txtLebar);
    txtLuaskeliling = (EditText) findViewById(R.id.txtLuaskeliling);
    btnHitung = (Button) findViewById(R.id.btnHitung);

}
    public void hitungLuas(View view) {

        try {
            int panjang = Integer.parseInt(txtPanjang.getText().toString());
            int lebar = Integer.parseInt(txtLebar.getText().toString());
            int luas = panjang * lebar;
            txtLuaskeliling.setText(String.valueOf(luas));

        } catch

        (Exception e) {
            e.printStackTrace();
        }
    }

public void hitungKeliling(View view) {
    try {
        int panjang = Integer.parseInt(txtPanjang.getText().toString());
        int lebar = Integer.parseInt(txtLebar.getText().toString());
        int keliling = (2*panjang)+(2*lebar);
        txtLuaskeliling.setText(String.valueOf(keliling));

    } catch

    (Exception e) {
        e.printStackTrace();
    }

}

    public void Pindah(View view) {
        Intent intent = new Intent(persegipanjang.this,MainActivity.class);
        startActivity(intent);
    }
}
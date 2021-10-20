package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this,persegipanjang.class);
        startActivity(intent);
    }
    public void Pindah1(View view) {
        Intent intent = new Intent(MainActivity.this,segitiga.class);
        startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(MainActivity.this,lingkaran.class);
        startActivity(intent);
    }


}
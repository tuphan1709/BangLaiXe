package com.example.banglaixe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void HLT_click(View view) {
        Intent intent = new Intent(MainActivity.this, activity_hoc_ly_thuyet.class);
        startActivity(intent);
    }

    public void TSH_click(View view) {
        Intent intent = new Intent(MainActivity.this, ThiSatHach.class);
        startActivity(intent);
    }

    public void BB_click(View view) {
        Intent intent = new Intent(MainActivity.this, BienBao.class);
        startActivity(intent);
    }
}

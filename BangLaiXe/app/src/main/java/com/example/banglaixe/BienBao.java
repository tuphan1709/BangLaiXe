package com.example.banglaixe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BienBao extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bien_bao);
        this.getSupportActionBar().hide(); // to hide title bar
        BottomNavigationView bottomNavigation = findViewById(R.id.nav_bottom);
        //bottomNavigation.setOnNavigationItemSelectedListener(navListener);
        //getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_Container, new AlarmFragment()).commit();
    }

}

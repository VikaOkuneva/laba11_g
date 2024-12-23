package com.example.laba11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBor(View v) {
        Intent intent = new Intent(this, pogoda_bor.class);
        startActivity(intent);
    }
    public void mos(View v) {
        Intent intent = new Intent(this, MainActivityMoscva.class);
        startActivity(intent);
    }
    public void saratov(View v) {
        Intent intent = new Intent(this, saratov.class);
        startActivity(intent);
    }
    public void tambov(View v) {
        Intent intent = new Intent(this, tambov.class);
        startActivity(intent);
    }
    public void voro(View v) {
        Intent intent = new Intent(this, voro.class);
        startActivity(intent);
    }
    public void volgograd(View v) {
        Intent intent = new Intent(this, volgograd.class);
        startActivity(intent);
    }
}
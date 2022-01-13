package com.example.letturadati;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    GestioneBrani gb = new GestioneBrani();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //costruisce mettodo activity(costruttore)
        setContentView(R.layout.activity_main); //costruisce mettodo activity(costruttore)
    }
}
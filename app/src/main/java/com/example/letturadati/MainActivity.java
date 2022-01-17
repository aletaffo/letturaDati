package com.example.letturadati;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnIns, btnVis;
    EditText durata, genere, autore, titolo;
    GestioneBrani gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //costruisce mettodo activity(costruttore)
        setContentView(R.layout.activity_main); //costruisce mettodo activity(costruttore)

        btnIns = findViewById(R.id.inserisci);
        btnVis = findViewById(R.id.visualizza);
        titolo = findViewById(R.id.titolo);
        autore = findViewById(R.id.autore);
        genere = findViewById(R.id.genere);
        durata = findViewById(R.id.durata);
        gb = new GestioneBrani();

        btnIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(titolo.getText().toString());
            }
        });

        btnVis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
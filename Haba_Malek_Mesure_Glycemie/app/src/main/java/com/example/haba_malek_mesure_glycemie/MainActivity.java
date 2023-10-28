package com.example.haba_malek_mesure_glycemie;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etValeur; //l’EditText qui comporte la valeur mesurée.
    private TextView tvAge;
    private SeekBar sbage;
    private RadioButton rbtOui;
    private RadioButton rbtnon;
    private Button btnConsulter ;
    //private TextView tvReponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        sbage.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("Information", "onProgressChanged " + progress);
                // affichage dans le Log de Android studio pour voir les changements détectés sur le SeekBar ..
                tvAge.setText("Votre âge : "+ progress);
                // Mise à jour du TextView par la valeur : progress à chaque changement.
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekbar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

    }
    private void init()
    {
        etValeur = findViewById(R.id.etValeur);
        tvAge = findViewById(R.id.tvAge);
        sbage = findViewById(R.id.sbage);
        rbtOui = findViewById(R.id.rbtOui);
        rbtnon = findViewById(R.id.rbtnon);
        btnConsulter = findViewById(R.id.btnConsulter);
        //tvReponse = findViewById(R.id.tvReponse);
    }

µ
    µµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµµ






































































































        µ
}
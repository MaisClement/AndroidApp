package com.example.walnut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class AfficheMatiereWebActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_affiche_matiere_web);

        Intent intent = getIntent ();
        String messageRecu = intent.getStringExtra(MainActivity.EXTRA_MESSAGE) ;
        WebView affichageWeb = findViewById (R.id.navigateur);

// if (messageRecu.equals IgnoreCase ("slam3")) // monDiffuseur.setText (this.getText (R.string.texte_sio));

        if (messageRecu.equalsIgnoreCase ("slam4")){
            affichageWeb.loadUrl ("file:///android_asset/OUI.html");

        } else
            affichageWeb.loadUrl ("file:///android_asset/erreur.html");
    }
}
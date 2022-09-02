package com.example.a1wrzesnia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var obraz = findViewById<ImageView>(R.id.obraz)
        var vis = findViewById<Button>(R.id.visbtn)

        vis.setOnClickListener {
            if(obraz.isVisible == true) {
                vis.text = "Pokaż zdjęcie";
                obraz.isVisible = false;
            }
            else {
                vis.text = "Ukryj zdjęcie";
                obraz.isVisible = true;
            }
        }
    }
}
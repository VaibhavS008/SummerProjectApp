package com.example.summerapp

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.net.Uri

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    fun myClickHandler(view: View){
        Log.i("MainActivity","button clicked")
        //var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456"))
        //startActivity(dialIntent)
        var webIntent:Intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.vlr.gg"))
        startActivity(webIntent)
    }
}
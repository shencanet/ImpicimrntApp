package com.rja.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showWebContent(view: View) {
        //val intent = Intent(Intent.ACTION_DIAL , Uri.parse("tel://12345"))
        //val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://www.pue.es"))
        val intent: Intent = Intent().apply {
            action = Intent.ACTION_VIEW
            data = Uri.parse("https://www.pue.es")
        }

        val chooserIntent = Intent.createChooser(intent, null)
        startActivity(chooserIntent)
    }
}
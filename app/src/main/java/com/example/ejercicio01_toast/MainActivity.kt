package com.example.ejercicio01_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Soy un onCreate",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Soy un onStart",
                Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Soy un onResume",
                Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Soy un onPause",
                Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Soy un onStop",
                Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "Soy un onRestart",
                Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Soy un onDestroy",
                Toast.LENGTH_LONG).show()
    }
}
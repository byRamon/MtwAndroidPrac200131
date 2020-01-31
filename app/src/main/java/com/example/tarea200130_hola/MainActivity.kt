package com.example.tarea200130_hola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //TODO
    public fun hola(view: View){
        Toast.makeText(this,"Hola",Toast.LENGTH_LONG).show()
    }
    //TODO
    public fun contadorClicks(view: View){
        count++
        lblContador.text = "" + count
    }
}

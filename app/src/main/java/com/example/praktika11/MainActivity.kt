package com.example.praktika11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    var on: Boolean = true
    fun Click1 (view: View){

        val ImageView3 = findViewById<ImageView>(R.id.imageView3)
        ImageView3.visibility = View.VISIBLE
    }
    fun Click2 (view: View) {
        val ImageButton : ImageButton = findViewById(R.id.imageButton1)

        if (on) {
        ImageButton.setImageResource(R.drawable.qwert)
            on = false
        }
        else{
        ImageButton.setImageResource(R.drawable.sdgrdgrs)
            on = true

        }
    }
}
package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            rolldice()
        }

    }
    private fun rolldice() {
        val textview = findViewById<TextView>(R.id.textView)
        val image = findViewById<ImageView>(R.id.imageView)
        val randomnumber = Random.nextInt(6)+1
        if (randomnumber ==1){
            image.setImageResource(R.drawable.one)

        }
        if (randomnumber ==2){
            image.setImageResource(R.drawable.two)

        }
        if (randomnumber ==3){
            image.setImageResource(R.drawable.three)

        }
        if (randomnumber ==4){
            image.setImageResource(R.drawable.four)

        }
        if (randomnumber ==5){
            image.setImageResource(R.drawable.five)

        }
        if (randomnumber ==6){
            image.setImageResource(R.drawable.six)

        }
        textview.text = randomnumber.toString()

    }
}
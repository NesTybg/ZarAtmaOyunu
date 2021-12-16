package com.enesas.zaratma

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var zar1Image: ImageView = findViewById(R.id.zar1)
        var zar2Image: ImageView = findViewById(R.id.zar2)
        var button: Button = findViewById(R.id.button)
        var zarSonucText: TextView = findViewById(R.id.zarSonuc)

        button.setOnClickListener() {
            var random1 = (1..6).random()
            var random2 = (1..6).random()

            when (random1) {
                1 -> zar1Image.setImageResource(R.drawable.dice_1)
                2 -> zar1Image.setImageResource(R.drawable.dice_2)
                3 -> zar1Image.setImageResource(R.drawable.dice_3)
                4 -> zar1Image.setImageResource(R.drawable.dice_4)
                5 -> zar1Image.setImageResource(R.drawable.dice_5)
                6 -> zar1Image.setImageResource(R.drawable.dice_6)
            }
            when (random2) {
                1 -> zar2Image.setImageResource(R.drawable.dice_1)
                2 -> zar2Image.setImageResource(R.drawable.dice_2)
                3 -> zar2Image.setImageResource(R.drawable.dice_3)
                4 -> zar2Image.setImageResource(R.drawable.dice_4)
                5 -> zar2Image.setImageResource(R.drawable.dice_5)
                6 -> zar2Image.setImageResource(R.drawable.dice_6)

            }

            zarSonucText.text= "Zar Sonucu : ".toString()+(random1 +random2).toString()

        }
    }
}


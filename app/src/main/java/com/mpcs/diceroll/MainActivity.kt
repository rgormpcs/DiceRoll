package com.mpcs.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll:Button= findViewById(R.id.rollButton)

        roll.setOnClickListener(){
            rollDice()
        }
    }

    private fun rollDice() {
        try {
            val resultText: TextView = findViewById(R.id.txtMessage)
            var dice= Dice(6)
            val diceImage: ImageView = findViewById(R.id.imageView)
            when( dice.roll()){
                1-> {resultText.text = "1"
                    diceImage.setImageResource(R.drawable.one)}
                2-> {resultText.text = "2"
                    diceImage.setImageResource(R.drawable.two)}
                3-> {resultText.text = "3"
                    diceImage.setImageResource(R.drawable.three)}
                4-> {resultText.text = "4"
                    diceImage.setImageResource(R.drawable.four)}
                5-> {resultText.text = "5"
                    diceImage.setImageResource(R.drawable.five)}
                6-> {resultText.text = "6"
                    diceImage.setImageResource(R.drawable.six)}
            }
            val toast=Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT)

            toast.show()
        }catch ( e: Exception){
            println("Error whe rolling dice:"+e)

        }
    }
}
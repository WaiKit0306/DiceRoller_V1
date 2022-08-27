package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create A Id to use it on the function
        val rollButton: Button =findViewById(R.id.button)

        //Challenge Task
        val countUp :Button = findViewById(R.id.countBut)

        countUp.setOnClickListener{countUp()}
        //Click and Function
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice() {
        //Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()


        //Change Name
        val resultText : TextView = findViewById(R.id.resultText)
        //resultText.text = "Dice Rolled!"

        //Random Num
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()


    }

    private fun countUp()
    {
        val resultText : TextView = findViewById(R.id.resultText)
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        }else
        {
            var curretResult = resultText.text.toString().toInt()

            if(curretResult <6){
                curretResult++
                resultText.text = curretResult.toString()
            }
        }
    }
}
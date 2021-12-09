package com.develop.dsc_lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var baslaTusu:Button=findViewById(R.id.baslangic)
        var textView:TextView=findViewById(R.id.textView)
        var image: ImageView=findViewById(R.id.imageView)

        baslaTusu.setOnClickListener{
            var rndm=(1..6).random()
            textView.text=rndm.toString()
            when(rndm){
                1->image.setImageResource(R.drawable.dice1)
                2->image.setImageResource(R.drawable.dice2)
                3->image.setImageResource(R.drawable.dice3)
                4->image.setImageResource(R.drawable.dice4)
                5->image.setImageResource(R.drawable.dice5)
                6->image.setImageResource(R.drawable.dice6)
            }
            Toast.makeText(this, "zar oluşturuldu", Toast.LENGTH_SHORT).show()
        }
    }
}



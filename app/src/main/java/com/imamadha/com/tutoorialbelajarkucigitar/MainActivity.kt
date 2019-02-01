package com.imamadha.com.tutoorialbelajarkucigitar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var Button:Button
    lateinit var Button1:Button
    lateinit var Button2:Button
    lateinit var Button3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Button= findViewById(R.id.button)
        Button1= findViewById(R.id.button1)
        Button2= findViewById(R.id.button2)
        Button3= findViewById(R.id.button4)

        Button.setOnClickListener {
            startActivity(Intent(this,DefinisigitarActivity::class.java))
        }
        Button1.setOnClickListener {
            startActivity(Intent(this,BermaingitarActivity::class.java))
        }
        Button2.setOnClickListener {
            startActivity(Intent(this,CarabelajarActivity::class.java))
        }
        Button3.setOnClickListener {
            startActivity(Intent(this,KunciGitar::class.java))
        }
    }
}

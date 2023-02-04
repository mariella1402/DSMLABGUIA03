package com.example.myapplicationpractica03dsm104

import android.content.ContentValues.TAG
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.log
private const val TAG ="PRUEBA"
class MainActivity : AppCompatActivity() {
    private lateinit var txtNumber1: EditText
    private lateinit var txtNumber2: EditText
    private lateinit var btnSumar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtNumber1=findViewById<EditText>(R.id.IdNumber1)
        txtNumber2=findViewById<EditText>(R.id.IdNumber2)
        btnSumar=findViewById<Button>(R.id.idbutton)

        btnSumar.setOnClickListener{
            var producto : Int
            var num1: Int
            var num2 : Int


            num1=Integer.parseInt(txtNumber1.text.toString().trim())
            num2=Integer.parseInt(txtNumber2.text.toString().trim())
            producto = num1+num2

            Log.d(TAG, "la suma de ${num1}+${num2}= ${producto}")


        }


        lifecycle.addObserver(MiLifeCycleObserver())
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onResume(){
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        super.onPause()
    }
    override fun onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        super.onStop()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}
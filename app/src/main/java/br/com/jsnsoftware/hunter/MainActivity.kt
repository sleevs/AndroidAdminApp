package br.com.jsnsoftware.hunter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

//   var et_user_name = findViewById(R.id.et_user_name) as EditText
//


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var email = findViewById(R.id.editTextEmail)as EditText
        var senha = findViewById(R.id.editTextSenha)as EditText
        var btn = findViewById(R.id.buttonLogin)as Button
        var txt = findViewById(R.id.textViewCriaConta)as TextView



        btn.setOnClickListener(){
            val usuario = email.text ;
            val senha = senha.text ;


            Toast.makeText(this@MainActivity, usuario ,  Toast.LENGTH_LONG).show();

        }

        txt.setOnClickListener(){
            val intent = Intent(applicationContext, CriarContaActivity::class.java)
            startActivity(intent)
        }

    }





}

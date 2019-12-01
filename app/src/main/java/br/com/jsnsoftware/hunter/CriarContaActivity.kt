package br.com.jsnsoftware.hunter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_criar_conta.*

class CriarContaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_conta)


        var email = findViewById(R.id.editTextCadastroEmail)as EditText
        var senha = findViewById(R.id.editTextCadastroSenha)as EditText
        var btn = findViewById(R.id.buttonCastrarConta)as Button
        var nome = findViewById(R.id.editTextCadastroNome)as EditText

        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change : ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })

        btn.setOnClickListener{
            // Get the checked radio button id from radio group
            val usuarioEmail = email.text ;
            val usuarioSenha = senha.text ;
            val usuarioNome = nome.text ;

            var id: Int = radio_group.checkedRadioButtonId
            if (id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(id)
                Toast.makeText(applicationContext,"btn click : ${radio.text}"+ usuarioNome + usuarioEmail + usuarioSenha,
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"Btn click : nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }


    fun checkButton(view : View){

        val radio : RadioButton = findViewById(radio_group.checkedRadioButtonId)

        Toast.makeText(this@CriarContaActivity, "TIPO SELECIONADO : ${radio.text}" ,  Toast.LENGTH_LONG).show();
    }
}

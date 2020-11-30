package com.pedromassango.keyper.ui.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pedromassango.keyper.R
import com.pedromassango.keyper.ui.frutas.FrutasActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContrato.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializa o Presenter
        presenter = MainPresenter( this)

        btn_login.setOnClickListener {

            val nome = edt_username.text.toString()
            val senha = edt_password.text.toString()

            presenter.loginClicado(nome = nome, senha = senha)
        }
    }

    override fun mostrarMensagem(texto: String) {
        Toast.makeText(this, texto, Toast.LENGTH_LONG).show()
    }

    override fun iniciaActividadeFrutas() {

        startActivity( Intent(this, FrutasActivity::class.java))
    }

}

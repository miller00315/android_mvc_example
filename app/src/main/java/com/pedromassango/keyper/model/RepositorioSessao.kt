package com.pedromassango.keyper.model

/**
 * Created by Pedro Massango on 6/13/18.
 */
class RepositorioSessao {

    val nome = "aula"
    val senha = "1234"

    fun login(mNome: String, mSenha: String): Boolean{

        return (mNome == nome && mSenha == senha)
    }

}
package com.pedromassango.keyper.ui.main

import com.pedromassango.keyper.model.RepositorioSessao

/**
 * Created by Pedro Massango on 6/13/18.
 */
class MainPresenter(private val view: MainContrato.View) : MainContrato.Presenter{

    private var repositorioSessao: RepositorioSessao = RepositorioSessao()


    override fun loginClicado(nome: String, senha: String) {

        if(nome.isEmpty()){
           view.mostrarMensagem("Nome invalido!")
            return
        }

        if(senha.isEmpty()){
            view.mostrarMensagem("Digite uma senha")
            return
        }


        // --------------
        //view.mostrarProgresso()

        val loginComSucesso = repositorioSessao.login(nome, senha)

        if(loginComSucesso) {

            view.mostrarMensagem("Login efetuado!")

            view.iniciaActividadeFrutas()

        }else{
            view.mostrarMensagem("Falha no login")
        }
    }

}
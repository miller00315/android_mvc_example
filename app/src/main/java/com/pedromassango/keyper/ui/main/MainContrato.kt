package com.pedromassango.keyper.ui.main

/**
 * Created by Pedro Massango on 6/13/18.
 */
interface MainContrato {

    interface View{

        fun mostrarMensagem(texto: String)

        fun iniciaActividadeFrutas()
        //fun mostrarProgresso()

        //fun mostrarProgresso()
    }

    interface Presenter {
        // sera chamado quando o botao de login for clicado
        fun loginClicado(nome: String,
                         senha: String)
    }

}
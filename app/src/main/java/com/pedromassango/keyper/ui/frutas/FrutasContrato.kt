package com.pedromassango.keyper.ui.frutas

/**
 * Created by Pedro Massango on 6/15/18.
 */
interface FrutasContrato {

    interface View{
        fun mostraDados(frutas: Array<String>)
    }

    interface Presenter{

        fun getFrutas()
    }
}
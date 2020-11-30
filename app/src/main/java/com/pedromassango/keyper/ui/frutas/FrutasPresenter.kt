package com.pedromassango.keyper.ui.frutas

import com.pedromassango.keyper.model.RepositorioFrutas

/**
 * Created by Pedro Massango on 6/13/18.
 */
class FrutasPresenter(private val view: FrutasContrato.View,
                      private val repositorioFrutas: RepositorioFrutas) : FrutasContrato.Presenter {

   // private val repositorioFrutas = RepositorioFrutas()

    override fun getFrutas() {

        val frutas = repositorioFrutas.getFrutas()

        frutas.sortBy { it.length }

        view.mostraDados( frutas)
    }
}
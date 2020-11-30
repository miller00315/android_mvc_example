package com.pedromassango.keyper.model

/**
 * Created by Pedro Massango on 6/13/18.
 */
class RepositorioFrutas{

    private val frutas = arrayOf(
            "Banana",
            "Manga",
            "Pera",
            "Pecego"
    )

    fun getFrutas(): Array<String>{
        return frutas
    }

}
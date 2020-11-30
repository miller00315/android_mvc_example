package com.pedromassango.keyper.ui.frutas

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import com.pedromassango.keyper.R
import com.pedromassango.keyper.model.RepositorioFrutas

class FrutasActivity : AppCompatActivity(), FrutasContrato.View {

    private lateinit var presenter: FrutasPresenter

    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var lista: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        // iniciar presenter
        presenter = FrutasPresenter(
                this,
                RepositorioFrutas()
        )


        lista = findViewById<ListView>(R.id.lista_frtutas)
        //lista.adapter = adapter

        // carregar frutas
        presenter.getFrutas()
    }

    override fun mostraDados(frutas: Array<String>) {

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, frutas)

        lista.adapter = adapter
    }
}

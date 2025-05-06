package br.com.cecode.routines.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.cecode.routines.R
import br.com.cecode.routines.model.Card
import br.com.cecode.routines.ui.recyclerview.adapter.CardsListAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val name = findViewById<TextView>(R.id.textView)
//        name.text = "Acordar 6:00"
//        val score = findViewById<TextView>(R.id.score)
//        score.text = "16 dias"
//        val offensive = findViewById<TextView>(R.id.offensive)
//        offensive.text = "10 dias"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = CardsListAdapter(context = this, listOf(
            Card(
                name = "Acordar cedo",
                score = "10 dias",
                offensive = "5 dias"
            ), Card(
                name = "Ler um capítulo do livro",
                score = "1 dias",
                offensive = "1 dias"
            ), Card(
                name = "Beber 2 Litros de agua",
                score = "20 dias",
                offensive = "3 dias"
            )
        ))
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
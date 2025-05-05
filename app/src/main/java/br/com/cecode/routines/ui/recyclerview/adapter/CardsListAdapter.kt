package br.com.cecode.routines.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.cecode.routines.R
import br.com.cecode.routines.model.Card

class CardsListAdapter(
    private val context: Context,
    private val cards: List<Card>
) : RecyclerView.Adapter<CardsListAdapter.ViewHolder>() {

    class  ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(card: Card) {
            val name = itemView.findViewById<TextView>(R.id.textView)
            name.text = card.name
            val score = itemView.findViewById<TextView>(R.id.score)
            score.text = card.score
            val offensive = itemView.findViewById<TextView>(R.id.offensive)
            offensive.text = card.offensive
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.itens_cards, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = cards.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val card = cards[position]
        holder.bind(card)
    }

}

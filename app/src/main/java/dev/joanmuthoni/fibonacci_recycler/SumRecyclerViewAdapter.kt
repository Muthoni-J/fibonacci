package dev.joanmuthoni.fibonacci_recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class SumRecyclerViewAdapter (var sumList: List<Int>): RecyclerView.Adapter<SumViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SumViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.sum_list_items, parent,false)
        return SumViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SumViewHolder, position: Int) {
        holder.tvnumbers.text = sumList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return sumList.size
    }
}

class SumViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvnumbers = itemView.findViewById<TextView>(R.id.tvnumbers)
}



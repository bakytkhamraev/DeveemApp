package com.example.deveemapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.deveemapp.R
import com.example.deveemapp.extensions.loadImage
import com.example.deveemapp.model.ItemModel
import kotlinx.android.synthetic.main.item.view.*

class HomeAdapter(private val listener: Listener) :
    RecyclerView.Adapter<HomeAdapter.HomeFragmentHolder>() {
    private var list: MutableList<ItemModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeFragmentHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item, parent, false)
        return HomeFragmentHolder(view)
    }

    override fun onBindViewHolder(holder: HomeFragmentHolder, position: Int) {
        holder.onBind(list[position], listener)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    fun initList(listItems: MutableList<ItemModel>) {
        this.list = listItems
    }

    class HomeFragmentHolder(items: View) : RecyclerView.ViewHolder(items) {
        fun onBind(model: ItemModel, listener: Listener) {
            itemView.item_title_tv.text = model.title
            itemView.price_size.text = model.price.toString()
            itemView.currency.text = model.currency
            itemView.location_tv.text = model.location
            itemView.weight.text = model.weight
            itemView.image.loadImage(model.url.toString())
            itemView.setOnClickListener { listener.onItemClick(model) }
        }
    }

    interface Listener {
        fun onItemClick(item: ItemModel)
    }
}
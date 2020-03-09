package com.example.a4daysassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a4daysassignment.R
import com.example.a4daysassignment.model.Shoe
import kotlinx.android.synthetic.main.shoe_layout.view.*

class ShoeAdapter(var shoeList: ArrayList<Shoe>): RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder>() {

    inner class ShoeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindShoe(shoe: Shoe) {
            itemView.shoe_id.text = shoe.id.toString().padStart(3, '0')
            itemView.shoe_name.text = shoe.name
            itemView.shoe_price.text = "$"+shoe.price.toString()
            itemView.shoe_image.setImageResource(shoe.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.shoe_layout, parent, false)
        return ShoeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoeList.size
    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        holder.bindShoe(shoeList[position])
    }

}
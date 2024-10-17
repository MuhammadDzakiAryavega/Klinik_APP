package com.dzaki_aryavega.klinik_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dzaki_aryavega.klinik_app.R
import com.dzaki_aryavega.klinik_app.model.modelicon

class AdapterMenuIcon(
    val itemMenuList: List<modelicon>
) : RecyclerView.Adapter<AdapterMenuIcon.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgMenuIcon: ImageView = itemView.findViewById(R.id.imgMenuIcon)
        var txtNamaMenu: TextView = itemView.findViewById(R.id.txtItemNamaDr)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMenuList[position]
        holder.imgMenuIcon.setImageResource(currentItem.iconImage)
        holder.txtNamaMenu.setText(currentItem.iconName)
    }
}

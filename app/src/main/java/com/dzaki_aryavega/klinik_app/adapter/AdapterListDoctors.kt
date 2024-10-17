package com.dzaki_aryavega.klinik_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dzaki_aryavega.klinik_app.R
import com.dzaki_aryavega.klinik_app.model.modelicon
import com.dzaki_aryavega.klinik_app.model.modellistdoctor

class AdapterListDoctors(
    val itemMenuListDoctors: List<modellistdoctor>
) : RecyclerView.Adapter<AdapterListDoctors.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgDoctors: ImageView = itemView.findViewById(R.id.imgitemDoctors)
        var txtNamaDoctors: TextView = itemView.findViewById(R.id.txtItemNamaDr)
        var txtBidang: TextView = itemView.findViewById(R.id.txtItemBidangDr)
        var txtJumlahReview: TextView = itemView.findViewById(R.id.txtItemJumlahReview)
        var txtJumlahRating: TextView = itemView.findViewById(R.id.txtItemJumlahRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doctor, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuListDoctors.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMenuListDoctors[position]
        holder.imgDoctors.setImageResource(currentItem.image)
        holder.txtNamaDoctors.setText(currentItem.doctor)
        holder.txtBidang.setText(currentItem.bidang)
        holder.txtJumlahReview.setText(currentItem.totalreview)
        holder.txtJumlahRating.setText(currentItem.angkareview)
    }
}

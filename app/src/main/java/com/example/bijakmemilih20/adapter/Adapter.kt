package com.example.bijakmemilih20.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bijakmemilih20.DetailActivity
import com.example.bijakmemilih20.R
import com.example.bijakmemilih20.model.partai

class Adapter (private val listPartai: ArrayList<partai>) :RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val namaPartai: TextView = itemView.findViewById(R.id.tv_nama_partai)
        val logoPartai: ImageView = itemView.findViewById(R.id.img_partai)
        val namaKetuaPartai: TextView = itemView.findViewById(R.id.tv_ketua_partai)
        val nomorUrut: TextView = itemView.findViewById(R.id.tv_no_urut)
    }
//menghubungkan layout item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.data_recycler_partai, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            val partai = listPartai[position]
        Glide.with(holder.itemView.context)
            .load(partai.logo)
            .into(holder.logoPartai)
            holder.namaPartai.text = partai.namaPartai
            holder.namaKetuaPartai.text = partai.namaKetua
            holder.nomorUrut.text = partai.nomorPartai

        holder.itemView.setOnClickListener {
             val pergiKeDetailActivity = Intent(it.context, DetailActivity::class.java)
                 pergiKeDetailActivity.putExtra(DetailActivity.namapartai, partai.namaPartai)
                    pergiKeDetailActivity.putExtra(DetailActivity.logopartai, partai.logo)
                    pergiKeDetailActivity.putExtra(DetailActivity.namaketua, partai.namaKetua)
                    pergiKeDetailActivity.putExtra(DetailActivity.nomorpartai, partai.nomorPartai)
                    pergiKeDetailActivity.putExtra(DetailActivity.visipartai, partai.visi)
                    pergiKeDetailActivity.putExtra(DetailActivity.misipartai, partai.misi)
                    pergiKeDetailActivity.putExtra(DetailActivity.tahunberdiri, partai.tahunBerdiri)
                    pergiKeDetailActivity.putExtra(DetailActivity.alamatkantor, partai.alamatKantor)
                    pergiKeDetailActivity.putExtra(DetailActivity.website, partai.website)
                    pergiKeDetailActivity.putExtra(DetailActivity.deskripsi, partai.deskripsi)
            it.context.startActivity(pergiKeDetailActivity)

             }

        }



    override fun getItemCount(): Int {

        return listPartai.size
    }

}


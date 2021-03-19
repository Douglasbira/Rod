package com.biradev.rod.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.biradev.rod.Model.Music
import com.biradev.rod.R

class AdapterListMusic (
    val musics: List<Music>,
    val onItemClickListener: ((music : Music) -> Unit)

    ): RecyclerView.Adapter<AdapterListMusic.MusicsViewHolder>() {

    class MusicsViewHolder(itemview: View, val onItemClickListener: ((music: Music)-> Unit)): RecyclerView.ViewHolder(itemview){


        private var title = ""

        fun bindView(musics: Music){
            title = musics.title


            itemView.setOnClickListener{
                onItemClickListener.invoke(musics)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent,false)
        return MusicsViewHolder(view,onItemClickListener)
    }

    override fun onBindViewHolder(holder: MusicsViewHolder, position: Int) {
        holder.bindView(musics[position])

    }

    override fun getItemCount() = musics.count()

}
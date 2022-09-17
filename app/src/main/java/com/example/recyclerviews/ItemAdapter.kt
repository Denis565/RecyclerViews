package com.example.recyclerviews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ItemAdapter (
    private val context: Context,
    private val images: ArrayList<TitleCreate>,
    val listener: (TitleCreate) ->Unit) : RecyclerView.Adapter<ItemAdapter.ImageViewHolder>(){

    class ImageViewHolder(view: View):RecyclerView.ViewHolder(view){
        val imageSrc = view.findViewById<ImageView>(R.id._image)
        val title = view.findViewById<TextView>(R.id._title)

        fun bindView(image: TitleCreate,listener: (TitleCreate) -> Unit){
            title.text = image.nameList
            itemView.setOnClickListener { listener(image) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list,parent,false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position],listener)
    }
}

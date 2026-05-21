package com.yourlastname.lab4mobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class PlaceAdapter(
    private val places: List<Place>
) : RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {

    class PlaceViewHolder(parent: ViewGroup) :
        RecyclerView.ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_place, parent, false)
        ) {
        val iconImageView: ImageView = itemView.findViewById(R.id.placeIconImageView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        return PlaceViewHolder(parent)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val place = places[position]

        holder.iconImageView.setImageResource(place.iconResId)
        holder.titleTextView.text = place.title
        holder.descriptionTextView.text = place.description

        holder.itemView.setOnClickListener {
            val bundle = Bundle().apply {
                putString("title", place.title)
                putString("description", place.description)
                putInt("iconResId", place.iconResId)
            }

            holder.itemView.findNavController()
                .navigate(R.id.placeDetailFragment, bundle)
        }
    }

    override fun getItemCount(): Int = places.size
}
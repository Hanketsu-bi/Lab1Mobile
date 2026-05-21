package com.yourlastname.lab4mobile

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class PlaceDetailFragment : Fragment(R.layout.fragment_place_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val icon = view.findViewById<ImageView>(R.id.detailIconImageView)
        val title = view.findViewById<TextView>(R.id.detailTitleTextView)
        val description = view.findViewById<TextView>(R.id.detailDescriptionTextView)

        title.text = arguments?.getString("title")
        description.text = arguments?.getString("description")
        icon.setImageResource(
            arguments?.getInt("iconResId") ?: android.R.drawable.ic_menu_mapmode
        )
    }
}
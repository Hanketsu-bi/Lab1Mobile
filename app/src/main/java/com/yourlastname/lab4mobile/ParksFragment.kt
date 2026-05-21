package com.yourlastname.lab4mobile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ParksFragment : Fragment(R.layout.fragment_parks) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.parksRecyclerView)

        val places = listOf(
            Place("Central Park", "Большой городской парк", android.R.drawable.ic_menu_mapmode),
            Place("Green Garden", "Место для прогулок", android.R.drawable.ic_menu_mapmode),
            Place("River Park", "Парк у реки", android.R.drawable.ic_menu_mapmode),
            Place("Sunny Park", "Детские площадки", android.R.drawable.ic_menu_mapmode),
            Place("Nature Park", "Много зелени", android.R.drawable.ic_menu_mapmode)
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = PlaceAdapter(places)
    }
}
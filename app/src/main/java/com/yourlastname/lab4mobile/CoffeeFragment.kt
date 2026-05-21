package com.yourlastname.lab4mobile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CoffeeFragment : Fragment(R.layout.fragment_coffee) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.coffeeRecyclerView)

        val places = listOf(
            Place("Coffee House", "Уютная кофейня в центре", android.R.drawable.ic_menu_compass),
            Place("Black Coffee", "Большой выбор напитков", android.R.drawable.ic_menu_compass),
            Place("Urban Cafe", "Современный интерьер", android.R.drawable.ic_menu_compass),
            Place("Morning Coffee", "Лучший кофе города", android.R.drawable.ic_menu_compass),
            Place("Coffee Time", "Десерты и кофе", android.R.drawable.ic_menu_compass)
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = PlaceAdapter(places)
    }
}
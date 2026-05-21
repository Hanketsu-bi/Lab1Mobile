package com.yourlastname.lab4mobile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantsFragment : Fragment(R.layout.fragment_restaurants) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.restaurantsRecyclerView)

        val places = listOf(
            Place("Italian Food", "Итальянская кухня", android.R.drawable.ic_menu_myplaces),
            Place("Tokyo Sushi", "Японская кухня", android.R.drawable.ic_menu_myplaces),
            Place("Burger House", "Бургеры и закуски", android.R.drawable.ic_menu_myplaces),
            Place("Family Restaurant", "Для всей семьи", android.R.drawable.ic_menu_myplaces),
            Place("BBQ Place", "Мясные блюда", android.R.drawable.ic_menu_myplaces)
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = PlaceAdapter(places)
    }
}
package com.pmtaller2.OO197822_StephanieEcheverria.data

import androidx.compose.runtime.mutableStateListOf
import com.pmtaller2.OO197822_StephanieEcheverria.model.Dish

object CartManager {
    val cartItems = mutableStateListOf<Dish>()

    fun addToCart(dish: Dish) {
        cartItems.add(dish)
    }
}

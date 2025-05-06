package com.pmtaller2.OO197822_StephanieEcheverria.model

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageResId: Int,
    val categories: List<String>,
    val menu: List<Dish>
)

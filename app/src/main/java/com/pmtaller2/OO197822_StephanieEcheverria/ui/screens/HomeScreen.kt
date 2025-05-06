package com.pmtaller2.OO197822_StephanieEcheverria.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pmtaller2.OO197822_StephanieEcheverria.data.DummyData
import com.pmtaller2.OO197822_StephanieEcheverria.model.Restaurant
import com.pmtaller2.OO197822_StephanieEcheverria.ui.components.RestaurantItem

@Composable
fun HomeScreen(onRestaurantClick: (Restaurant) -> Unit) {
    val restaurants = DummyData.listaRestaurantes

    val categorias = restaurants
        .flatMap { it.categories }
        .distinct()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        categorias.forEach { categoria ->
            item {

                Text(
                    text = categoria,
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.SemiBold),
                    modifier = Modifier
                        .padding(vertical = 12.dp)
                )

                val restaurantesFiltrados = restaurants.filter {
                    it.categories.contains(categoria)
                }

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.padding(bottom = 16.dp)
                ) {
                    items(restaurantesFiltrados) { restaurante ->
                        RestaurantItem(restaurant = restaurante, onClick = onRestaurantClick)
                    }
                }
            }
        }
    }
}

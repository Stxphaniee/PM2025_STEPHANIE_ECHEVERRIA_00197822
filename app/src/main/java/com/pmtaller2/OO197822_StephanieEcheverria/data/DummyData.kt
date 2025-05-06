package com.pmtaller2.OO197822_StephanieEcheverria.data

import com.pmtaller2.OO197822_StephanieEcheverria.R
import com.pmtaller2.OO197822_StephanieEcheverria.model.Dish
import com.pmtaller2.OO197822_StephanieEcheverria.model.Restaurant

object DummyData {

    val listaRestaurantes = listOf(
        Restaurant(
            id = 1,
            name = "Charlie Boy",
            description = "Hamburguesas artesanales hechas en parrilla",
            imageResId = R.drawable.charlie,
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(1, "Hamburgesa BBQ", "Hamburguesa doble con salsa BBQ", R.drawable.bbq),
                Dish(2, "Papas twister", "Papas fritas con forma espiral", R.drawable.papas),
                Dish(3, "Coca cola", "Refresco de coca cola", R.drawable.coca)
            )
        ),
        Restaurant(
            id = 2,
            name = "Taquería Taquito Feliz",
            description = "Tacos con sabor a México",
            imageResId = R.drawable.tacofeliz,
            categories = listOf("Comida Mexicana"),
            menu = listOf(
                Dish(4, "Tacos al Pastor", "Con piña y todo", R.drawable.tacoalpastor),
                Dish(5, "Burrito", "Relleno de tocino y maíz", R.drawable.burrito),
                Dish(6, "Nachos", "Con queso y jalapeños", R.drawable.nachos),
                Dish(7, "Horchata", "Refresco de horchata con canela", R.drawable.horchata)
            )
        ),
        Restaurant(
            id = 3,
            name = "Don Li",
            description = "Comida asiática",
            imageResId = R.drawable.donli,
            categories = listOf("Comida Asiática"),
            menu = listOf(
                Dish(8, "Sushi Roll", "Clásico roll de salmón", R.drawable.sushi),
                Dish(9, "Ramen Deluxe", "Con huevo y panceta", R.drawable.ramen),
                Dish(10, "Tempura Mix", "Verduras y camarones", R.drawable.tempura),
                Dish(11, "Bubble Tea Taro", "Milk tea de taro", R.drawable.taro)
            )
        ),
        Restaurant(
            id = 4,
            name = "Vida é Bella",
            description = "Auténtica comida italiana",
            imageResId = R.drawable.vitaebella,
            categories = listOf("Comida Italiana"),
            menu = listOf(
                Dish(12, "Spaghetti Bolognesa", "Pasta con salsa de carne", R.drawable.spaguetti),
                Dish(13, "Lasagna", "Capas de pasta con carne y queso", R.drawable.lasana),
                Dish(14, "Tiramisu", "Postre italiano clásico", R.drawable.tiramisu)
            )
        ),
        Restaurant(
            id = 5,
            name = "Pizza Mamma Mia",
            description = "Pizzería tradicional napolitana",
            imageResId = R.drawable.mammamia,
            categories = listOf("Comida Italiana"),
            menu = listOf(
                Dish(15, "Pizza Margherita", "Tomate, mozzarella y albahaca", R.drawable.pizzamargarita),
                Dish(16, "Pizza Pepperoni", "Clásica con extra pepperoni", R.drawable.pepperoni),
                Dish(17, "Focaccia", "Pan horneado con aceite de oliva", R.drawable.focaccia)
            )
        ),
        Restaurant(
            id = 6,
            name = "Dulce pecado",
            description = "Especializado en postres",
            imageResId = R.drawable.dulcepecado,
            categories = listOf("Postres"),
            menu = listOf(
                Dish(18, "Cheesecake", "Clásico de mora", R.drawable.cheesecake),
                Dish(19, "Brownie", "Con nueces y chocolate derretido", R.drawable.brownie),
                Dish(20, "Sorbete de chorro", "Sabores naturales", R.drawable.helado)
            )
        ),
        Restaurant(
            id = 7,
            name = "Café Fulanos",
            description = "Café de especialidad en ambiente acogedor",
            imageResId = R.drawable.cafe,
            categories = listOf("Cafetería"),
            menu = listOf(
                Dish(21, "Capuccino", "Espuma cremosa y café fuerte", R.drawable.capuchino),
                Dish(22, "Atol de maíz tostado", "Fécula de maíz", R.drawable.atoldemaiztostado),
                Dish(23, "Agua", "", R.drawable.agua)
            )
        )
    )
}

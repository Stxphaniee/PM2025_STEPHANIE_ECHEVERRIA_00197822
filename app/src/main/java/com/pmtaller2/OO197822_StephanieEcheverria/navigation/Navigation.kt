package com.pmtaller2.OO197822_StephanieEcheverria.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.pmtaller2.OO197822_StephanieEcheverria.data.DummyData
import com.pmtaller2.OO197822_StephanieEcheverria.model.Restaurant
import com.pmtaller2.OO197822_StephanieEcheverria.ui.screens.*
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart

@Composable
fun Navigation() {
    val navController = rememberNavController()

    val items = listOf(
        BottomNavItem("home", "Restaurantes", Icons.Filled.Home),
        BottomNavItem("search", "Buscar", Icons.Filled.Search),
        BottomNavItem("orders", "Órdenes", Icons.Filled.ShoppingCart)
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                val currentBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = currentBackStackEntry?.destination?.route

                items.forEach { item ->
                    NavigationBarItem(
                        selected = currentDestination == item.route,
                        onClick = { navController.navigate(item.route) },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.label,
                                tint = if (currentDestination == item.route)
                                    MaterialTheme.colorScheme.primary
                                else
                                    MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                            )
                        },
                        label = {
                            Text(
                                text = item.label,
                                fontWeight = if (currentDestination == item.route)
                                    FontWeight.Bold
                                else
                                    FontWeight.Normal,
                                color = if (currentDestination == item.route)
                                    MaterialTheme.colorScheme.primary
                                else
                                    MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                            )
                        },
                        alwaysShowLabel = true
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") {
                HomeScreen(onRestaurantClick = {
                    navController.navigate("menu/${it.id}")
                })
            }
            composable("search") { SearchScreen(navController = navController) }
            composable("orders") { OrdersScreen() }
            composable(
                "menu/{restaurantId}",
                arguments = listOf(navArgument("restaurantId") { type = NavType.IntType })
            ) { backStackEntry ->
                val restaurantId = backStackEntry.arguments?.getInt("restaurantId") ?: 0
                val restaurant: Restaurant? = DummyData.listaRestaurantes.find { it.id == restaurantId }
                restaurant?.let {
                    MenuScreen(restaurant = it, navController = navController)
                }
            }
        }
    }
}

data class BottomNavItem(val route: String, val label: String, val icon: ImageVector)

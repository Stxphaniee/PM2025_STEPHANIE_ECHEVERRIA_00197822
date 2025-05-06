package com.pmtaller2.OO197822_StephanieEcheverria.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pmtaller2.OO197822_StephanieEcheverria.data.CartManager

@Composable
fun OrdersScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Pantalla de órdenes", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(CartManager.cartItems) { dish ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(text = dish.name, style = MaterialTheme.typography.bodyLarge)
                        Text(text = dish.description, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}

package com.pmtaller2.OO197822_StephanieEcheverria.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pmtaller2.OO197822_StephanieEcheverria.model.Restaurant

@Composable
fun RestaurantItem(restaurant: Restaurant, onClick: (Restaurant) -> Unit) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .padding(end = 12.dp)
            .clickable { onClick(restaurant) },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = restaurant.imageResId),
                    contentDescription = restaurant.name,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = restaurant.name, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

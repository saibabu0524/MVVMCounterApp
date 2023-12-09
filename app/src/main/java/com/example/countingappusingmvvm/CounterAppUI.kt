package com.example.countingappusingmvvm

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun Counter(viewModel: CounterViewModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "The Current Count ${viewModel.count.value}")
        Row {
            Button(onClick = { viewModel.decrementCount() }) {
                Text(text = "Decrease")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { viewModel.incrementCount() }) {
                Text(text = "Increase")
            }
        }
    }
}
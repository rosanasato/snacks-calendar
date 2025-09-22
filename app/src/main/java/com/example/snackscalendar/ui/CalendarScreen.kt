package com.example.snackscalendar.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CalendarScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Button(
            onClick = {}
        ) {
            Text("Download snacks menu")
        }
    }
}

@Preview
@Composable
fun CalendarScreenPreview() {
    CalendarScreen()
}


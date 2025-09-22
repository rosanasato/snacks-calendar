package com.example.snackscalendar

import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.snackscalendar.ui.CalendarScreen

@Composable
fun CalendarApp() {
    Scaffold(
        topBar = { TopAppBar() }
    ) { innerPadding ->
        CalendarScreen(modifier = Modifier
            .padding(innerPadding)
            .padding(start = 32.dp, end = 32.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    val activity = LocalActivity.current

    CenterAlignedTopAppBar(
        title = { Text("Aparecida Merino Elias") },
        actions = {
            IconButton(onClick = { activity?.finish() }) {
                Icon(Icons.Filled.Close, contentDescription = "Close")
            }
        }
    )
}

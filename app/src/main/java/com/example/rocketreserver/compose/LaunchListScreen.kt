package com.example.rocketreserver.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.rocketreserver.R

@Composable
fun LaunchListScreen(toDetailsScreen: () -> Unit) {
    Scaffold(
        topBar = { RocketReserverTopBar() }
    ) {
        LaunchList()
    }
}
// launch: LaunchListQuery.Launch, toLaunchDetails: () -> Unit

@Composable
fun RocketReserverTopBar() {
    TopAppBar(backgroundColor = MaterialTheme.colors.primary) {
        Text(text = "RocketReserver", style = MaterialTheme.typography.h6)
    }
}

@Composable
fun LaunchList(list: List<String> = emptyList()) {
    LazyColumn() {
        items(items = list) { text ->
            LaunchItem(text = text)
        }
    }
}
@Composable
fun LaunchItem(text: String) {
    val rowHeight = 100.dp
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable { }
    ) {
        val painter = rememberImagePainter(null) {
            placeholder(R.drawable.ic_placeholder)
        }
        Image(
            painter = painter,
            modifier = Modifier
                .size(rowHeight)
                .padding(16.dp),
            contentDescription = "launch image"
        )
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(start = 20.dp)
                .height(rowHeight)
        ) {
            Text(
                text = text,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = text,
                modifier = Modifier.padding(top = 8.dp),
                fontSize = 18.sp

            )
        }
    }
    Divider(
    color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f),
    thickness = 1.dp,
    )
}

@Preview(showBackground = true)
@Composable
fun LaunchPreview() {
    val details = "Launch Site #1"
    LaunchItem(text = details)
}

@Preview(showBackground = true)
@Composable
fun ListPreview() {
    val list = listOf("Launch Site #1", "Launch Site #2", "Launch Site #3", "Launch Site #4", "Launch Site #5", "Launch Site #6", "Launch Site #7", "Launch Site #8", "Launch Site #9", "Launch Site #10")
    LaunchList(list)
}
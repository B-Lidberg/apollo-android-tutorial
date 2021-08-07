package com.example.rocketreserver.compose


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.rocketreserver.R
import com.example.rocketreserver.compose.ui.theme.RocketServerTheme


@Composable
fun LaunchDetailScreen() {
    // Row with Launch Details + book button
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)
    ) {
        LaunchDetails()
        BookButton()
    }

}

@Composable
fun LaunchDetails() {
    Row(modifier = Modifier.height(200.dp)) {
        val painter = rememberImagePainter(null) {
            placeholder(R.drawable.ic_placeholder)
        }
        Image(
            painter = painter,
            contentDescription = "Launch Image",
            modifier = Modifier
                .size(200.dp)
                .padding(16.dp)

        )

        // Launch Info: mission name, rocket name, id
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxHeight()
        ) {
            Text(
                text = "Starlink-15 (v1.0)",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "\uD83D\uDE80 Falcon 9 FT",
                fontSize = 20.sp
            )
            Text(
                text = "CCAFS SLC 40",
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun BookButton() {
    Button(
        onClick = {  },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 50.dp)
    ) {
        Text("BOOK NOW")
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    RocketServerTheme {
        LaunchDetailScreen()
    }
}
@Preview(showBackground = true)
@Composable
fun DetailsPreview() {
    RocketServerTheme {
        LaunchDetails()
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    RocketServerTheme {
        BookButton()
    }
}




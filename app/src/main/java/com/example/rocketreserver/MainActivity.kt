package com.example.rocketreserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rocketreserver.compose.LaunchDetailScreen
import com.example.rocketreserver.compose.LaunchListScreen
import com.example.rocketreserver.compose.ui.theme.RocketServerTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            RocketServerTheme {
                Surface(color = MaterialTheme.colors.background) {
                    RocketServerApp()
                }
            }
        }

    }
}

@Composable
fun RocketServerApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.LaunchList.route
    ) {

        composable(Screen.LaunchList.route) {
            LaunchListScreen { navController.navigate("${Screen.LaunchDetail.route}/$it") }
        }

        composable(Screen.LaunchDetail.route) {
            LaunchDetailScreen()
        }
    }
    LaunchDetailScreen()
}

sealed class Screen(val route: String) {
    object LaunchList : Screen("home")
    object LaunchDetail : Screen("details")
}



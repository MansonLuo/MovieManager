package com.example.moviemanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.moviemanager.MainScreen
import com.example.moviemanager.MovieDetailScreen
import com.example.moviemanager.Screen
import com.example.moviemanager.SettingScreen

@Composable
fun NavigationStack() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Main.route,
    ) {
        composable(route = Screen.Main.route) {
            MainScreen(navController = navController)
        }

        composable(
            route = Screen.MovieDetail.route + "?movieUrl={movieUrl}",
            arguments =  listOf(
                navArgument("movieUrl") {
                    type = NavType.StringType
                    nullable = true
                }
            )
        ) {
            MovieDetailScreen(movieUrl = it.arguments?.getString("movieUrl")) {
                navController.popBackStack()
            }
        }

        composable(
            route = Screen.SettingScreen.route
        ) {
            SettingScreen()
        }
    }
}
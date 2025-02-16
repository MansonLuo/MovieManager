package com.example.moviemanager

sealed class Screen(val route: String) {
    object Main: Screen("main_screen")
    object MovieDetail: Screen("movie_detail")
    object SettingScreen: Screen("setting_screen")
}
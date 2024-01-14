package com.fgr.onesignalapp.navigation

sealed class NavRoute (val route: String) {
    data object HomeScreen: NavRoute(route = "home_screen")
    data object DetailScreen: NavRoute(route = "detail_screen")
}
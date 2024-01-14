package com.fgr.onesignalapp.navigation

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.fgr.onesignalapp.ui.screen.detail.DetailScreen
import com.fgr.onesignalapp.ui.screen.home.HomeScreen

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = NavRoute.HomeScreen.route) {
        composable(
            route = NavRoute.HomeScreen.route
        ) {
            HomeScreen(navHostController = navHostController)
        }
        composable(
            route = NavRoute.DetailScreen.route,
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "neodigitalcreation.com/{id}"
                    action = Intent.ACTION_VIEW
                }
            ),
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = -1
                }
            )
        ) {
            val id = it.arguments?.getInt("id") ?: -1
            DetailScreen(navHostController = navHostController, id)
        }
    }
}
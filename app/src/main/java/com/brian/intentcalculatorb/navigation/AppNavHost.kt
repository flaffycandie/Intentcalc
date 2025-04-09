package com.brian.intentcalculatorb.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.brian.intentcalculatorb.screens.home.Home_Screen

@Composable
fun AppNav(modifier: Modifier = Modifier,
           navController: NavHostController=rememberNavController(),
           startDestination: String =ROUTE_HOME
) {
    NavHost(navController = navController, modifier = modifier,
        startDestination = startDestination) {
        composable(ROUTE_HOME) {
            Home_Screen()
        }

    }

}
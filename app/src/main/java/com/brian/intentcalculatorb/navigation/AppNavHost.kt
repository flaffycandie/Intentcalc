package com.brian.intentcalculatorb.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.brian.intentcalculatorb.screens.Web_Screen
import com.brian.intentcalculatorb.screens.calc.Calc_Screen
import com.brian.intentcalculatorb.screens.home.Home_Screen
import com.brian.intentcalculatorb.screens.intent.Intent_Screen

@Composable
fun AppNav(modifier: Modifier = Modifier,
           navController: NavHostController=rememberNavController(),
           startDestination: String =ROUTE_HOME
) {
    NavHost(navController = navController, modifier = modifier,
        startDestination = startDestination) {
        composable(ROUTE_HOME) {
            Home_Screen(navController)
        }
        composable(ROUTE_WEB) {
            Web_Screen(navController)
        }
        composable(ROUTE_INTENT)
        {
            Intent_Screen(navController)
        }
        composable(ROUTE_CALC) {
            Calc_Screen(navController)
        }

    }

}



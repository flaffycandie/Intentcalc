package com.brian.intentcalculatorb.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.brian.intentcalculatorb.navigation.ROUTE_CALC
import com.brian.intentcalculatorb.navigation.ROUTE_INTENT
import com.brian.intentcalculatorb.navigation.ROUTE_WEB


@Composable
fun Home_Screen(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()

    ) {
        Text("Home preview",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.White

        )
        Spacer(modifier = Modifier.height(50.dp))
        Button({navController.navigate(ROUTE_CALC)},
            modifier= Modifier.width(300.dp)) {
            Text("Calculator",
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.DarkGray)

        }
        Spacer(modifier = Modifier.height(50.dp))

        Button({navController.navigate(ROUTE_INTENT)},
            modifier= Modifier.width(300.dp)) {
            Text("Intent",
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.DarkGray)

        }
        Spacer(modifier = Modifier.height(50.dp))

        Button({navController.navigate(ROUTE_WEB)},
            modifier= Modifier.width(300.dp)) {
            Text("Web",
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.DarkGray)

        }
    }

}

@Preview
@Composable
private fun Home_Preview() {
    Home_Screen(rememberNavController())

}
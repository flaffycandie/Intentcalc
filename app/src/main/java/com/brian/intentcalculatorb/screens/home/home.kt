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

@Composable
fun Home_Screen(modifier: Modifier = Modifier) {
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
        Button({/*TODO*/},
            modifier= Modifier.width(300.dp)) {
            Text("Calculator",
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.DarkGray)

        }
        Spacer(modifier = Modifier.height(50.dp))

        Button({/*TODO*/},
            modifier= Modifier.width(300.dp)) {
            Text("Intent",
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.DarkGray)

        }
        Spacer(modifier = Modifier.height(50.dp))

        Button({/*TODO*/},
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
    Home_Screen()

}
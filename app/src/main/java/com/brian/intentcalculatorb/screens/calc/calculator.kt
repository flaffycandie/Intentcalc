package com.brian.intentcalculatorb.screens.calc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calc_Screen(modifier: Modifier = Modifier) {
    var Firstnum by remember { mutableStateOf(TextFieldValue())}
    var Secondnum by remember { mutableStateOf(TextFieldValue())}
    var text by remember { mutableStateOf("")}

    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {
        Text(text = "Answer here!!!",
            color = Color.Blue,
            fontSize = 29.sp,
            fontFamily = FontFamily.Monospace
        )
        OutlinedTextField(value = Firstnum,
            onValueChange = {Firstnum=it}, label = {Text("Enter the first number",
                color = Color.Blue,
                fontSize = 15.sp)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

        OutlinedTextField(value = Secondnum,
            onValueChange = {Secondnum=it},
            label = {Text(text = "Enter the second number",
                color = Color.Blue,
                fontSize = 15.sp)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

        OutlinedButton({/*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("+",
                fontSize = 30.sp)}
        OutlinedButton({/*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("-",
                fontSize = 30.sp)}
        OutlinedButton({/*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("/",
                fontSize = 30.sp)}
        OutlinedButton({/*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("*",
                fontSize = 30.sp)

        }

    }

}

@Preview
@Composable
private fun Calc_Preview() {
    Calc_Screen()

}
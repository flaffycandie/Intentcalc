package com.brian.intentcalculatorb.screens.intent

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Intent_Screen(rememberNavController())

        }
    }
}
@Composable
fun Intent_Screen(navController: NavHostController) {
    val context= LocalContext.current
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray)){
        Text("Intent Screen",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
        )
        OutlinedButton({ val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254717990927"))

            if (ContextCompat.checkSelfPermission(
                    context,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                context.startActivity(intent)}},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("Call",
                fontFamily = FontFamily.Cursive, fontSize = (15.sp)
            )}
        OutlinedButton({val uri = Uri.parse("smsto:0768215874")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is todays weather")

            context.startActivity(intent)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("sms",
                fontFamily = FontFamily.Cursive, fontSize = (15.sp)
            )}
        OutlinedButton({  val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(context as Activity,takePictureIntent,1,null)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("Camera",
                fontFamily = FontFamily.Cursive, fontSize = (15.sp)
            )}
        OutlinedButton({  val simToolKitLaunchIntent =
            context.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { context.startActivity(it) }},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("STK",
                fontFamily = FontFamily.Cursive, fontSize = (15.sp)
            )}
        OutlinedButton({val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            context.startActivity(shareIntent)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("Share",
                fontFamily = FontFamily.Cursive, fontSize = (15.sp)
            )}
        OutlinedButton({ val phone = "0768215874"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            context.startActivity(intent)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("Dial",
                fontFamily = FontFamily.Cursive, fontSize = (15.sp)
            )}
        OutlinedButton({val emailIntent= Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","abc@gmail.com",null)
        )
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Body")
            context.startActivity(emailIntent)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("Email",
                fontFamily = FontFamily.Cursive, fontSize = (15.sp)
            )}



    }

}

@Preview(showBackground = true)
@Composable
private fun Intent_Preview() {
    Intent_Screen(rememberNavController())


}
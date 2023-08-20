package com.example.mit

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mit.ui.theme.MitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mit()

        }
    }
}

@Composable
fun Mit(){

    Column(
        modifier = Modifier
//            .fillMaxHeight()
//            .fillMaxWidth()
            .background(Color.Cyan)
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        
        Text(text = "MIT", color = Color.Magenta, fontSize = 30.sp)
        
        Text(text = "First App", color = Color.Blue, fontSize= 30.sp)


        val login = LocalContext.current
        Button(onClick = {
            login.startActivity(Intent(login,LoginActivity::class.java))


        }) {
            Text(text = "Login Here")
            
        }



    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Mit()

}
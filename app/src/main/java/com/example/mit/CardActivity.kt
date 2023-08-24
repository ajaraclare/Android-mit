package com.example.mit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mit.ui.theme.MitTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            kadi()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun kadi(){

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()


    ){



    Row (
        modifier = Modifier
            .fillMaxSize(),

        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically


    ){

        Card (
            shape = RoundedCornerShape(40),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(Color.Black)

        ){

            Text(text = "This is Card 1",
                fontSize = 30.sp,
                color = Color.Magenta)

        }
        
        Spacer(modifier = Modifier.width(15.dp))

        Card (
            shape = RoundedCornerShape(40),
            elevation = CardDefaults.cardElevation(10.dp),
            colors = CardDefaults.cardColors(Color.Black),


        ){

            Text(text = "This is Card 2",
                fontSize = 30.sp,
                color = Color.Green)

        }



    }

}

}


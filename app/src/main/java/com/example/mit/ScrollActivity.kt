package com.example.mit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mit.ui.theme.MitTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Scroll()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Scroll(){

//    The ability to scroll is called recyclerview
//    lazy columns are scrollable

    Column(
        modifier = Modifier
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center



    ){
        LazyColumn(){

           items(100){
               index ->  Text(text = "App")
           }

        }











    }








}



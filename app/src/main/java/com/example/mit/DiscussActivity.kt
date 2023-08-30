package com.example.mit

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mit.ui.theme.MitTheme

class DiscussActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Practise()

        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Practise(){

    Scaffold(
        topBar = { Row {

        } },
        content = {
            Column(
            ) {


                LazyColumn(){

                    item {

                        Column {

                            Text(
                                text = "Text",
                                fontSize = 50.sp,
                                color = Color.White

                            )

                            LazyRow(){

                                item {
                                    Card(
                                        shape = RoundedCornerShape(9),
                                        elevation = CardDefaults.cardElevation(9.dp),
                                        colors = CardDefaults.cardColors(Color.Green)

                                    ){
                                        Text(text = "Where are we",
                                            fontSize = 40.sp,
                                            color = Color.Red


                                        )

                                        Image(
                                            painter = painterResource(id = R.drawable.tree),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(160.dp)
                                                .height(160.dp)
                                        )



                                    }

                                    Spacer(modifier = Modifier.width(10.dp))


                                    Card(
                                        shape = RoundedCornerShape(9),
                                        elevation = CardDefaults.cardElevation(9.dp),
                                        colors = CardDefaults.cardColors(Color.Green)

                                    ){
                                        Text(text = "Where are we",
                                            fontSize = 40.sp,
                                            color = Color.Red


                                        )

                                        Image(
                                            painter = painterResource(id = R.drawable.tree),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(160.dp)
                                                .height(160.dp)
                                        )



                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Card(
                                        shape = RoundedCornerShape(9),
                                        elevation = CardDefaults.cardElevation(9.dp),
                                        colors = CardDefaults.cardColors(Color.Green)

                                    ){
                                        Text(text = "Where are we",
                                            fontSize = 40.sp,
                                            color = Color.Red


                                        )

                                        Image(
                                            painter = painterResource(id = R.drawable.tree),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(160.dp)
                                                .height(160.dp)
                                        )



                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text(text = "The Trees",
                                        fontSize = 46.sp,
                                        color = Color.Blue

                                    )

                                    Card(
                                        shape = RoundedCornerShape(9),
                                        elevation = CardDefaults.cardElevation(9.dp),
                                        colors = CardDefaults.cardColors(Color.Green)

                                    ){
                                        Text(text = "Tomorrow",
                                            fontSize = 40.sp,
                                            color = Color.Red


                                        )

                                        Image(
                                            painter = painterResource(id = R.drawable.tree),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .width(160.dp)
                                                .height(160.dp)
                                        )



                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text(text = "Anything dfdfd  dfdfdf. " + "Another Text iojoi joj "
                                            + "Another Text iojoi joj " + "Another Text iojoi joj ")

                                    Spacer(modifier = Modifier.width(10.dp))

                                    LazyRow(){

                                        item {

                                            Card(
                                                shape = CutCornerShape(10),
                                                elevation = CardDefaults.cardElevation(10.dp),
                                                colors = CardDefaults.cardColors(Color.Cyan)


                                            ){

                                            }




                                        }

                                    }

                                }

                            }

                        }



                    }

                }

            }
        },

        bottomBar = {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .background(Color.White)

            ) {
                Column {
                    Text(text = "Home")

                }


                Column {
                    Text(text = "Bookmarks")

                }

                Column {
                    Text(text = "Notes")

                }
            }




        }

    )



















}





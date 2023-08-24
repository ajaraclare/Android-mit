package com.example.mit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mit.ui.theme.MitTheme

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            app()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun app(){

    LazyColumn(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()


    ){
        item{
            Column() {

                Text(
                    text = "Category",
                    fontSize = 35.sp,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(10.dp))

                LazyRow() {
                    item {
                        Card(
                            shape = RoundedCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.Red)

                        ) {

                            Text(
                                text = "Fruits",
                                fontSize = 30.sp,
                                color = Color.White
                            )

                            Image(
                                painter = painterResource(id = R.drawable.tree),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(150.dp)
                            )

                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            shape = RoundedCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.LightGray)

                        ) {

                            Text(
                                text = "Veget",
                                fontSize = 30.sp,
                                color = Color.White
                            )

                            Image(
                                painter = painterResource(id = R.drawable.tree),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(150.dp)
                            )

                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            shape = RoundedCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.LightGray)

                        ) {

                            Text(
                                text = "Spices",
                                fontSize = 30.sp,
                                color = Color.White
                            )

                            Image(
                                painter = painterResource(id = R.drawable.tree),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(150.dp)


                            )

                        }


                    }
                }


                Spacer(modifier = Modifier.height(35.dp))

                Text(text = "Popular",
                    fontSize = 35.sp,
                    color = Color.White)

                Spacer(modifier = Modifier.height(10.dp))


                    Card (
                        modifier = Modifier
                            .fillMaxWidth(),

                    ){
                        Text(text = "Pomegranate",
                            fontSize = 25.sp,
                            color = Color.White)

                        Image(
                            painter = painterResource(id = R.drawable.tree),
                            contentDescription = null,
                            modifier = Modifier
                                .size(150.dp)
                                .align(Alignment.CenterHorizontally)



                        )

                    }


                Spacer(modifier = Modifier.height(35.dp))


                Text(
                    text = "Top Item",
                    fontSize = 35.sp,
                    color = Color.White

                )

                Spacer(modifier = Modifier.height(10.dp))


                LazyRow() {
                    item {
                        Card(
                            shape = RoundedCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.Red)

                        ) {

                            Text(
                                text = "Fresh Orange",
                                fontSize = 25.sp,
                                color = Color.White
                            )

                            Image(
                                painter = painterResource(id = R.drawable.tree),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(250.dp)
                            )

                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            shape = RoundedCornerShape(10),
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(Color.LightGray)

                        ) {

                            Text(
                                text = "Strawberry",
                                fontSize = 25.sp,
                                color = Color.White
                            )

                            Image(
                                painter = painterResource(id = R.drawable.tree),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(250.dp)


                            )

                        }

                    }

                }

            }


                    }


        }

    }







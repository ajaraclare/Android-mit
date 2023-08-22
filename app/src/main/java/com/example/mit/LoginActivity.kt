package com.example.mit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mit.ui.theme.MitTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun LoginScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center



    ,
        modifier = Modifier
            .background(Color.Green)
//            .fillMaxSize() This covers both width and height
            .fillMaxWidth()
            .fillMaxHeight()

//        The height that covers the content if we haven't specified it is called wrap content






    ){

        Text(text = "Login Screen",
            color= Color.Red,
            fontSize=30.sp)

        Text(text = "Welcome to the Login Screen",
            color = Color.Magenta,
            fontSize=30.sp)

        var usernamee by remember { mutableStateOf(TextFieldValue(text = "")) }

        var password by remember { mutableStateOf(TextFieldValue(text = "")) }



        OutlinedTextField(
            value = usernamee,
            label = { Text(text = "Username", color = Color.Red)},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "emailIcon") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = {
                usernamee = it
            }
        )

        Spacer(modifier = Modifier.height(10.dp) )

        OutlinedTextField(
            value = password,
            label = { Text(text = "Password", color = Color.Red)},
//            trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "emailIcon") },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "emailIcon") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = {
                password = it
            }
        )

        Spacer(modifier = Modifier.height(10.dp) )

        Button(
            onClick = { /*TODO*/ },
//            shape = RectangleShape,
//            shape = RoundedCornerShape(12.dp),
            shape = CutCornerShape(10),
            colors = ButtonDefaults.buttonColors(Color.Magenta)
        ) {
            Text(text = "Login")
            
        }



    }

}



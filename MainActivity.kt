package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessImage("Kshitij Datta", "Android Developer")
                }
            }
        }
    }
}

@Composable
fun CheckImage(str1: String, str2: String, phno: String, share: String, mail: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_launcher_foreground)
    val phImage = painterResource(R.drawable.phone)
    val shareImg = painterResource(R.drawable.share)
    val mailImg = painterResource(R.drawable.mail2)
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )  {
        Image (
            painter = image,
            contentDescription = "android",
            modifier = Modifier
                .size(160.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = str1,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            fontSize = 38.sp,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = str2,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
    }
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Image(
                painter = phImage,
                contentDescription = "phone",
                modifier = Modifier
                    .size(40.dp)

            )
            Text(
                text = phno,
                textAlign = TextAlign.Start,
                fontSize = 20.sp,
            )
        }
        Divider(thickness = 2.dp, color = Color.Black)
        Row {
            Image(
                painter = shareImg,
                contentDescription = "share",
                modifier = Modifier
                    .size(40.dp)

            )
            Text(
                text = share,
                textAlign = TextAlign.Start,
                fontSize = 20.sp,
            )
        }
        Divider(thickness = 2.dp, color = Color.Black)
        Row {
            Image(
                painter = mailImg,
                contentDescription = "mail",
                modifier = Modifier
                    .size(40.dp)

            )
            Text(
                text = mail,
                textAlign = TextAlign.Start,
                fontSize = 20.sp,
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessImage(message = "Kshitij Datta", from = "Android Developer")
    }
}


@Composable
fun BusinessImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty2)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        CheckImage(
            str1 = message,
            str2 = from,
            phno = "+91 2222222222",
            share = "@KshitijDat",
            mail = "myMailId123@gmail.com",
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .align(alignment = Alignment.Center)
        )
    }
}

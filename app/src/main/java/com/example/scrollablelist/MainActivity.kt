package com.example.scrollablelist

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scrollablelist.ui.theme.ScrollableListTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollableListTheme {
                // A surface container using the 'background' color from the theme

                Scaffold(
                    topBar = {
                        TopAppBar(
                            backgroundColor = MaterialTheme.colors.primary,
                            title={Text(text = "Seme Students Photo Gallery")}
                        )
                    }
                ) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        List()
                    }
                }
            }
        }
    }
}

@Composable
fun List() {
    LazyColumn{
        item {
            Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
                Image(
                    painter = painterResource(R.drawable.image1) ,
                    contentDescription ="Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop)

            }
            Text(text ="Session One" )
        }
        item {
            Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
                Image(
                    painter = painterResource(R.drawable.image2) ,
                    contentDescription ="Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop)

            }
            Text(text ="Session two" )
        }
        item {
            Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
                Image(
                    painter = painterResource(R.drawable.image3) ,
                    contentDescription ="Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop)

            }
            Text(text ="Session Three" )
        }
        item {
            Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
                Image(
                    painter = painterResource(R.drawable.image4) ,
                    contentDescription ="Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop)

            }
            Text(text ="Session Four" )
        }
        item {
            Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
                Image(
                    painter = painterResource(R.drawable.image5) ,
                    contentDescription ="Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop)

            }
            Text(text ="Session Five" )
        }
        item {
            Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
                Image(
                    painter = painterResource(R.drawable.image6) ,
                    contentDescription ="Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop)

            }
            Text(text ="Session Six" )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ScrollableListTheme {
        List()
    }
}
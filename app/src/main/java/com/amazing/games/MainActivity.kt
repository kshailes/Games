package com.amazing.games

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.amazing.games.ui.theme.GamesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GamesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val data = mutableListOf<IntArray>()
                    data.add(intArrayOf(0, 1, 0, 1))
                    data.add(intArrayOf(1, 1, 0, 1))
                    data.add(intArrayOf(0, 0, 0, 1))
                    data.add(intArrayOf(1, 0, 0, 1))
                    Greeting(data)
                }
            }
        }
    }
}

@Composable
fun Greeting(data: List<IntArray>) {
    Column(
        modifier = Modifier.border(2.dp, Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        data.forEach {
            val oneColumn = it.toList()
            LazyRow {
                items(oneColumn) { oneItem ->
                    Box(oneItem)
                }
            }
        }

    }
}

@Composable
fun Box(value: Int) {
    Text(text = value.toString(), modifier = Modifier
        .border(2.dp, Color.Black)
        .padding(32.dp))
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    GamesTheme {
//        Greeting("Android")
//    }
//}
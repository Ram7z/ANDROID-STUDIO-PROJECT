package com.example.androidtutorial
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androidtutorial.ui.theme.AndroidtutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidtutorialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "🔥🔥🔥",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    AndroidtutorialTheme {


        Text(
            text = "Hello Everyone myself Ram $name!",fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontSize = 44.sp,
                shadow = Shadow(
                    color = Color.Red,
                    offset = Offset(5.0f, 10.0f),
                    blurRadius = 5f,

                )
            ),
                    modifier = modifier,


        )
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidtutorialTheme {
        Greeting("🔥🔥🔥")
    }
}
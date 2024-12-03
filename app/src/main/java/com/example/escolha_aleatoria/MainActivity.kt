package com.example.escolha_aleatoria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.escolha_aleatoria.ui.theme.Escolha_aleatoriaTheme
import com.example.escolha_aleatoria.ui.theme.black
import com.example.escolha_aleatoria.ui.theme.lilita

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Escolha_aleatoriaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    cientista(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable

fun TelaPrincipal(modifier: Modifier = Modifier) {

    val darkTheme = remember { mutableStateOf(false) }

    Escolha_aleatoriaTheme(darkTheme.value) {
//yourContent

        val imagem = painterResource(id = R.drawable.inicio)

        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = imagem,
                contentDescription = "Fundo da tela principal",
                modifier = Modifier.fillMaxSize()
            )


            Box(
                modifier = Modifier
                    .fillMaxSize()

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(R.drawable.cinema),
                        contentDescription = "imagem de pipoca",
                        modifier = Modifier.size(170.dp)


                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Seja o protagonista\n  do seu filme!",
                        style = TextStyle(
                            color = black,
                            fontSize = 35.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = lilita,
                            textAlign = TextAlign.Center

                        )
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Button(
                        onClick = {darkTheme.value=!darkTheme.value},
                        modifier = Modifier.height(70.dp).width(300.dp). shadow(15.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)


                    ) {

                        Text(
                            text = "Iniciar",
                            style = TextStyle(
                                color = black,
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = lilita,
                                textAlign = TextAlign.Center

                            )
                        )
                    }
                }
            }
        }
    }
}

    @Preview(showBackground = true)
    @Composable
    fun TelaPrincipalPreview() {
        Escolha_aleatoriaTheme {
            TelaPrincipal()
        }
    }
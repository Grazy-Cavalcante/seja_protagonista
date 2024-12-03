package com.example.escolha_aleatoria

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.escolha_aleatoria.ui.theme.Escolha_aleatoriaTheme
import com.example.escolha_aleatoria.ui.theme.black
import com.example.escolha_aleatoria.ui.theme.lilita

@Composable

fun drama(modifier: Modifier = Modifier) {

    val darkTheme = remember { mutableStateOf(false) }

    Escolha_aleatoriaTheme(darkTheme.value) {
//yourContent

        val imagem = painterResource(id = R.drawable.laranja)

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
                        painterResource(R.drawable.drama),
                        contentDescription = "Mascaras coloridas",
                        modifier = Modifier.size(120.dp).offset(y = (-45).dp)


                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        contentAlignment = Alignment.Center
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(1.dp)
                        ) {
                            // Retângulo
                            Image(
                                painter = painterResource(id = R.drawable.retangulo),
                                contentDescription = "destaque azul",
                                contentScale = ContentScale.FillWidth,
                                modifier = Modifier
                                    .width(290.dp)
                                    .height(40.dp)
                                    .align(Alignment.Center)
                                    .offset(y = (-15).dp)
                            )

                            // Texto
                            Text(
                                text = "Drama",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 45.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = lilita,
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .offset(y = (-15).dp)
                            )
                        }


                    }


                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Um labirinto de\n emoções te espera!",
                        style = TextStyle(
                            color = black,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = lilita,
                            textAlign = TextAlign.Center

                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(y = -10.dp)
                    )

                }
                Row( modifier = Modifier
                    .fillMaxSize() .padding(bottom = 40.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { darkTheme.value = !darkTheme.value },
                        modifier = Modifier.height(70.dp).width(150.dp).offset(y = (-40).dp),
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)


                    ) {

                        Text(
                            text = "Voltar",
                            style = TextStyle(
                                color = black,
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = lilita,
                                textAlign = TextAlign.Center

                            )
                        )

                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    Button(
                        onClick = { darkTheme.value = !darkTheme.value },
                        modifier = Modifier.height(70.dp).width(150.dp).offset(y = (-40).dp),
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)


                    ) {

                        Text(
                            text = "Próxima",
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
fun DramaPreview() {
    Escolha_aleatoriaTheme {
        drama()
    }
}






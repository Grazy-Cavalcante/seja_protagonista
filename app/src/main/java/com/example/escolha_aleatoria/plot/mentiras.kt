package com.example.escolha_aleatoria.plot

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.escolha_aleatoria.R
import com.example.escolha_aleatoria.ui.theme.Escolha_aleatoriaTheme
import com.example.escolha_aleatoria.ui.theme.black
import com.example.escolha_aleatoria.ui.theme.lilita

@Composable

fun mentiras(navController: NavHostController) {

    val darkTheme = remember { mutableStateOf(false) }

    Escolha_aleatoriaTheme(darkTheme.value) {
//yourContent

        val imagem = painterResource(id = R.drawable.azul_claro)

        Box(
            modifier = Modifier
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
                        painterResource(R.drawable.mentira),
                        contentDescription = "emoji com o nariz grande",
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
                                text = "Mentiras",
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
                        text = "Você descobre que na verdade é adotado, e sua família verdadeira é bilionária.",
                        style = TextStyle(
                            color = black,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = lilita,
                            textAlign = TextAlign.Center

                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 28.dp, end = 28.dp)
                            .offset(y = -10.dp)
                    )

                }
                Row( modifier = Modifier
                    .fillMaxSize() .padding(bottom = 40.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = {  navController.popBackStack()  },
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
                        onClick = { navController.navigate("final")  },
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









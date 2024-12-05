package com.example.escolha_aleatoria.genero

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.escolha_aleatoria.R
import com.example.escolha_aleatoria.ui.theme.black
import com.example.escolha_aleatoria.ui.theme.lilita


@Composable

fun genero (navController: NavController) {

    val telasSorteio = listOf("romance", "acao", "drama","fantasia","terror")

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
                        painterResource(R.drawable.comedia),
                        contentDescription = "imagem de mascaras teatrais",
                        modifier = Modifier.size(170.dp)


                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "O gênero do\n seu filme é...!",
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
                        onClick = {
                            navController.navigate(telasSorteio.random())},
                        modifier = Modifier.height(70.dp).width(300.dp). shadow(15.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)


                    ) {

                        Text(
                            text = "Sortear",
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




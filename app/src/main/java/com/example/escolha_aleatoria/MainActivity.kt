package com.example.escolha_aleatoria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.escolha_aleatoria.Final.fim_cinco
import com.example.escolha_aleatoria.Final.fim_dois
import com.example.escolha_aleatoria.Final.fim_quatro
import com.example.escolha_aleatoria.Final.fim_tres
import com.example.escolha_aleatoria.Final.fim_um
import com.example.escolha_aleatoria.Final.final
import com.example.escolha_aleatoria.genero.acao
import com.example.escolha_aleatoria.genero.drama
import com.example.escolha_aleatoria.genero.fantasia
import com.example.escolha_aleatoria.genero.genero
import com.example.escolha_aleatoria.profissão.profissao
import com.example.escolha_aleatoria.genero.romance
import com.example.escolha_aleatoria.genero.terror
import com.example.escolha_aleatoria.plot.assassinato
import com.example.escolha_aleatoria.plot.fortuna
import com.example.escolha_aleatoria.plot.ganancia
import com.example.escolha_aleatoria.plot.mentiras
import com.example.escolha_aleatoria.plot.plot
import com.example.escolha_aleatoria.plot.traicao
import com.example.escolha_aleatoria.profissão.advogado
import com.example.escolha_aleatoria.profissão.cientista
import com.example.escolha_aleatoria.profissão.desenvolvedor
import com.example.escolha_aleatoria.profissão.empresario
import com.example.escolha_aleatoria.profissão.engenheiro
import com.example.escolha_aleatoria.profissão.escritor
import com.example.escolha_aleatoria.profissão.fotografo
import com.example.escolha_aleatoria.profissão.medico
import com.example.escolha_aleatoria.profissão.psicologo
import com.example.escolha_aleatoria.sinopse.sinopse
import com.example.escolha_aleatoria.sinopse.sinopse_cinco
import com.example.escolha_aleatoria.sinopse.sinopse_dois
import com.example.escolha_aleatoria.sinopse.sinopse_quatro
import com.example.escolha_aleatoria.sinopse.sinopse_tres
import com.example.escolha_aleatoria.sinopse.sinopse_um
import com.example.escolha_aleatoria.ui.theme.Escolha_aleatoriaTheme
import com.example.escolha_aleatoria.ui.theme.black
import com.example.escolha_aleatoria.ui.theme.lilita

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Escolha_aleatoriaTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "telaPrincipal"
    ) {
        composable("telaPrincipal") {
            telaPrincipal(navController = navController)
        }
        composable("genero") {
            genero(navController = navController)
        }
        composable("romance") {
            romance(navController = navController)
        }
        composable("terror") {
            terror(navController = navController)
        }
        composable("fantasia") {
            fantasia(navController = navController)
        }
        composable("drama") {
            drama(navController = navController)
        }
        composable("acao") {
            acao(navController = navController)
        }
        composable("profissao") {
            profissao(navController = navController)

        }
        composable("cientista") {
            cientista(navController = navController)
        }
        composable("empresario") {
            empresario(navController = navController)
        }
        composable("escritor") {
            escritor(navController = navController)
        }
        composable("medico") {
            medico(navController = navController)
        }
        composable("fotografo") {
            fotografo(navController = navController)
        }
        composable("psicologo") {
            psicologo(navController = navController)
        }
        composable("desenvolvedor") {
            desenvolvedor(navController = navController)
        }
        composable("advogado") {
            advogado(navController = navController)
        }
        composable("engenheiro") {
            engenheiro(navController = navController)
        }
        composable("sinopse") {
            sinopse(navController = navController)
        }
        composable("sinopse_um") {
            sinopse_um(navController = navController)
        }
        composable("sinopse_dois") {
            sinopse_dois(navController = navController)
        }
        composable("sinopse_tres") {
            sinopse_tres(navController = navController)
        }
        composable("sinopse_quatro") {
            sinopse_quatro(navController = navController)
        }
        composable("sinopse_cinco") {
            sinopse_cinco(navController = navController)
        }
        composable("plot") {
            plot(navController = navController)
        }
        composable("assassinato") {
            assassinato(navController = navController)
        }
        composable("traicao") {
            traicao(navController = navController)
        }
        composable("ganancia") {
            ganancia(navController = navController)
        }
        composable("mentiras") {
            mentiras(navController = navController)
        }
        composable("fortuna") {
            fortuna(navController = navController)
        }
        composable("final") {
            final(navController = navController)
        }
        composable("fim_um") {
            fim_um(navController = navController)
        }
        composable("fim_dois") {
            fim_dois(navController = navController)
        }
        composable("fim_tres") {
            fim_tres(navController = navController)
        }
        composable("fim_quatro") {
            fim_quatro(navController = navController)
        }
        composable("fim_cinco") {
            fim_cinco(navController = navController)
        }
    }
}
@Composable

fun telaPrincipal(navController: NavController) {

    val darkTheme = remember { mutableStateOf(false) }

    Escolha_aleatoriaTheme(darkTheme.value) {
//yourContent

        val imagem = painterResource(id = R.drawable.inicio)

        Box(
            modifier = Modifier.fillMaxSize()
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
                        onClick = {
                            navController.navigate("genero")
                        },
                        modifier = Modifier.height(70.dp).width(300.dp).shadow(15.dp),
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







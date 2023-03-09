package com.ersafra.freteminimoantt


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp


@Composable
fun TabelaScreen() {
    Column(
        modifier = Modifier.run {
            fillMaxSize()
                .wrapContentSize(Alignment.Center)
        }
    ) {
        FormTabela()
    }
}
@Composable
fun FracaoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            //.background(colorResource(id = R.color.colorPrimaryDark))
            .wrapContentSize(Alignment.Center)
    ) {
FormDiarias()
    }
}
@Composable
 fun DiariasScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        fun SearchBar(
            modifier: Modifier = Modifier
        ) {
        }
    }
}
//formulario da tabela --//
@Composable
fun FormTabela() {
    var origem by remember { mutableStateOf("") }
    var destino by remember { mutableStateOf("") }
    var distanciakm by remember { mutableStateOf("") }
    var numeroeixos by remember { mutableStateOf("") }
    var tipodefrete by remember { mutableStateOf("") }
    var tipodecarga by remember { mutableStateOf("") }

    Column(
       horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp, bottom = 8.dp)
            .paddingFromBaseline(0.5.dp)
    ) {
        Text(text = "Qual a cidade da coleta?",
            modifier = Modifier.padding(1.dp),
            style = TextStyle(fontWeight = FontWeight.Bold))
        OutlinedTextField(
            value = origem,
            onValueChange = { origem = it },
            label = { Text("Origem") },
            modifier = Modifier.fillMaxWidth()
        )
        //mapas
        Text(text = "Qual a cidade da entrega?",
            modifier = Modifier.padding(1.dp),
            style = TextStyle(fontWeight = FontWeight.Bold))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
        OutlinedTextField(
            value = destino,
            onValueChange = { destino = it },
            label = { Text("Destino") },
            modifier = Modifier
                .weight(1f)
                .padding(end = 4.dp)

        )
            Spacer(modifier = Modifier.weight(0.2f))
            OutlinedButton(
                onClick = { /* ação do botão */ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFD95857)),
                modifier = Modifier
                    .width(90.dp)
                    .height(48.dp)
            ) {
                Text("Mapa", color = Color.White)
            }
        }
        //fim maps
        Text(text = "Qual a distancia percorrida na rota?",
            modifier = Modifier.padding(1.dp),
            style = TextStyle(fontWeight = FontWeight.Bold))
        OutlinedTextField(
            value = distanciakm,
            onValueChange = { distanciakm = it },
            label = { Text("Kms 0.00") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        )
        Text(text = "Quantos eixos tem o conjunto?",
            modifier = Modifier.padding(1.dp),
            style = TextStyle(fontWeight = FontWeight.Bold))
        OutlinedTextField(
            value = numeroeixos,
            onValueChange = { numeroeixos = it },
            label = { Text("Eixos") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        )
        Text(text = "Qual o tipo de frete?",
            modifier = Modifier.padding(1.dp),
            style = TextStyle(fontWeight = FontWeight.Bold))
        OutlinedTextField(
            value = tipodefrete,
            onValueChange = { tipodefrete = it },
            label = { Text("Frete") },
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = "Qual o tipo de carga?",
            modifier = Modifier.padding(1.dp),
            style = TextStyle(fontWeight = FontWeight.Bold))
        OutlinedTextField(
            value = tipodecarga,
            onValueChange = { tipodecarga = it },
            label = { Text("Carga") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedButton(
            onClick = { /* Do something */ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFD95857)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
                .align(CenterHorizontally)
                .height(48.dp)
        ) {
            Text(stringResource(id = R.string.btnCalcular), color = Color.White)
        }
        Spacer(modifier = Modifier.weight(0.2f))
        //BannerAdView()
    }
}
@Composable
fun FormDiarias() {
    var textState by remember { mutableStateOf("") }
    Column(modifier = Modifier.padding(top = 8.dp, start = 16.dp, end = 16.dp, bottom = 8.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = textState,
                onValueChange = { textState = it },
                label = { Text("Digite algo...") },
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(10.dp)) // espaçamento entre os widgets
            OutlinedButton(
                onClick = { /* ação do botão */ },
                modifier = Modifier.wrapContentWidth()
            ) {
                Text("Mapa")
            }
        }
    }
}

//@Composable
//fun BannerAdView() {
//    AndroidView(
//        modifier = Modifier
//            .fillMaxWidth(),
//        factory = { context ->
//            AdView(context).apply {
//                setAdSize(AdSize.BANNER)
//                adUnitId = "ca-app-pub-2741955499317480/2875000844"
//                loadAd(AdRequest.Builder().build())
//            }
//        }
//    )
//}

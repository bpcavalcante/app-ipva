package br.com.bruno.ipva

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criar uma lista de opções para o Spinner
        val listaEstado = arrayListOf("Selecione o estado:",
            "Santa Catarina","Rio Grande do Sul","Paraná","Espírito Santo",
        "São Paulo", "Rio de Janeiro", "Minas Gerais","Sergipe","Paraíba",
        "Alagoas", "Pernambuco", "Rio Grande do Norte", "Ceará","Piauí","Maranhão","Bahia",
            "Acre", "Tocantins", "Pará","Amapá", "Amazonas", "Roraima", "Rondônia",
        "Mato Grosso do Sul", "Goiás", "Distrito Federal")

        // Criar um adaptador para o Spinner : layout
        val estadoAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            listaEstado
        )

        // Plugar o adaptador ao Spinner da tela
        spnMainEstado.adapter = estadoAdapter

        // Executando o clique do botão cadastrar
        btnMainCalcular.setOnClickListener {
            // Capturando os dados digitados
            val valor = edtMainValor.text.toString().trim()
            val estado = spnMainEstado.selectedItem.toString()

            // Validação dos Campos se estão vazios
            if (valor.isEmpty() || estado == listaEstado[0]) {
                // Apresentando mensagem de erro ao usuário
                Toast.makeText(this, "Preencha todos os campos !", Toast.LENGTH_LONG).show()
            }else{
                // Todos os campos preenchidos
                val valorDouble = valor.toDouble()
                if(estado == listaEstado[3]){
                    val media = valorDouble * 0.035

                    // Criando ou acessando o arquivo Shared Preferences
                    val  sharedPrefs = getSharedPreferences("user_imc", Context.MODE_PRIVATE)

                    // Editar o arquivo
                    val editPrefs = sharedPrefs.edit()

                    // Apresentando uma mensagem de sucesso ao usuário
                    Toast.makeText(this, "IPVA calculado !", Toast.LENGTH_LONG).show()

                    val mediaString = media.toString()

                    // Preparando os dados a serem salvos
                    editPrefs.putString("VALOR", valor)
                    editPrefs.putString("ESTADO", estado)
                    editPrefs.putString("MEDIA", mediaString)

                    // Salvar os dados no arquivo shared preferences
                    editPrefs.apply()

                    // Abri a ValorActivity
                    val mIntent = Intent(this, ValorActivity::class.java)

                    // Passando informações através da intent
                    mIntent.putExtra("INTENT_MEDIA", mediaString)
                    startActivity(mIntent)

                    // Tirar todas as telas do empilhamento
                    finishAffinity()

                }
                else if(estado == listaEstado[6] || estado == listaEstado[7]){
                    val media = valorDouble * 0.04
                    // Criando ou acessando o arquivo Shared Preferences
                    val  sharedPrefs = getSharedPreferences("user_imc", Context.MODE_PRIVATE)

                    // Editar o arquivo
                    val editPrefs = sharedPrefs.edit()

                    // Apresentando uma mensagem de sucesso ao usuário
                    Toast.makeText(this, "IPVA calculado !", Toast.LENGTH_LONG).show()

                    val mediaString = media.toString()

                    // Preparando os dados a serem salvos
                    editPrefs.putString("VALOR", valor)
                    editPrefs.putString("ESTADO", estado)
                    editPrefs.putString("MEDIA", mediaString)

                    // Salvar os dados no arquivo shared preferences
                    editPrefs.apply()

                    // Abri a ValorActivity
                    val mIntent = Intent(this, ValorActivity::class.java)

                    // Passando informações através da intent
                    mIntent.putExtra("INTENT_MEDIA", mediaString)
                    startActivity(mIntent)

                    // Tirar todas as telas do empilhamento
                    finishAffinity()

                }
                else if (estado == listaEstado[2] || estado == listaEstado[5] || estado == listaEstado[26]) {
                    val media = valorDouble * 0.03
                    // Criando ou acessando o arquivo Shared Preferences
                    val  sharedPrefs = getSharedPreferences("user_imc", Context.MODE_PRIVATE)

                    // Editar o arquivo
                    val editPrefs = sharedPrefs.edit()

                    // Apresentando uma mensagem de sucesso ao usuário
                    Toast.makeText(this, "IPVA calculado !", Toast.LENGTH_LONG).show()

                    val mediaString = media.toString()

                    // Preparando os dados a serem salvos
                    editPrefs.putString("VALOR", valor)
                    editPrefs.putString("ESTADO", estado)
                    editPrefs.putString("MEDIA", mediaString)

                    // Salvar os dados no arquivo shared preferences
                    editPrefs.apply()

                    // Abri a ValorActivity
                    val mIntent = Intent(this, ValorActivity::class.java)

                    // Passando informações através da intent
                    mIntent.putExtra("INTENT_MEDIA", mediaString)
                    startActivity(mIntent)

                    // Tirar todas as telas do empilhamento
                    finishAffinity()

                }
                else if (estado == listaEstado[1] || estado == listaEstado[4] || estado == listaEstado[8] ||
                    estado == listaEstado[9] || estado == listaEstado[17] || estado == listaEstado[18]){
                    val media = valorDouble * 0.02
                    // Criando ou acessando o arquivo Shared Preferences
                    val  sharedPrefs = getSharedPreferences("user_imc", Context.MODE_PRIVATE)

                    // Editar o arquivo
                    val editPrefs = sharedPrefs.edit()

                    // Apresentando uma mensagem de sucesso ao usuário
                    Toast.makeText(this, "IPVA calculado !", Toast.LENGTH_LONG).show()

                    val mediaString = media.toString()

                    // Preparando os dados a serem salvos
                    editPrefs.putString("VALOR", valor)
                    editPrefs.putString("ESTADO", estado)
                    editPrefs.putString("MEDIA", mediaString)

                    // Salvar os dados no arquivo shared preferences
                    editPrefs.apply()

                    // Abri a ValorActivity
                    val mIntent = Intent(this, ValorActivity::class.java)

                    // Passando informações através da intent
                    mIntent.putExtra("INTENT_MEDIA", mediaString)
                    startActivity(mIntent)

                    // Tirar todas as telas do empilhamento
                    finishAffinity()

                }
                else{
                    val media = valorDouble * 0.025

                    // Criando ou acessando o arquivo Shared Preferences
                    val  sharedPrefs = getSharedPreferences("user_imc", Context.MODE_PRIVATE)

                    // Editar o arquivo
                    val editPrefs = sharedPrefs.edit()

                    // Apresentando uma mensagem de sucesso ao usuário
                    Toast.makeText(this, "IPVA calculado !", Toast.LENGTH_LONG).show()

                    val mediaString = media.toString()

                    // Preparando os dados a serem salvos
                    editPrefs.putString("VALOR", valor)
                    editPrefs.putString("ESTADO", estado)
                    editPrefs.putString("MEDIA", mediaString)

                    // Salvar os dados no arquivo shared preferences
                    editPrefs.apply()

                    // Abri a ValorActivity
                    val mIntent = Intent(this, ValorActivity::class.java)

                    // Passando informações através da intent
                    mIntent.putExtra("INTENT_MEDIA", mediaString)
                    startActivity(mIntent)

                    // Tirar todas as telas do empilhamento
                    finishAffinity()

                }



            }
        }
    }
}
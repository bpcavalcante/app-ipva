package br.com.bruno.ipva

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_valor.*

class ValorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_valor)

        // Recuperar a media passada pela intent
        val media = intent.getStringExtra("INTENT_MEDIA")

        // Acessar a referência do arquivo de Shared Preferences
        val sharedPrefs = getSharedPreferences("user_imc", Context.MODE_PRIVATE)

        // Recuperar os dados gravados no SharedPreference
        val valor =  sharedPrefs.getString("VALOR", "chave não encontrada")
        val estado = sharedPrefs.getString("ESTADO", "chave não encontrada")
        val mediaString = sharedPrefs.getString("MEDIA", "chave não encontrada")

        // Exibindo os dados recuperado nas TextViews
        txwValorValorVeiculo.text = "%.2f".format(valor!!.toDouble())
        txwValorTotal.text = "%.2f".format(mediaString!!.toDouble())

        // Listener (ouvinte) do botão Sair
        btnValorSair.setOnClickListener {
            // Criando um Alert Dialog
            AlertDialog.Builder(this).setTitle("Atenção").setMessage("Deseja mesmo sair ? ")
                .setPositiveButton("Sair"){_, _ ->
                    Toast.makeText(this, "Obrigado por utilizar nosso aplicativo !", Toast.LENGTH_LONG).show()
                    finishAffinity()
                }
                .setNeutralButton("Não"){_,_ -> }.setCancelable(true).show()
        }

        // Lister (ouvinte) do botão Calcular Novamente
        btnValorCalcularNovamente.setOnClickListener {
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
        }

    }
}
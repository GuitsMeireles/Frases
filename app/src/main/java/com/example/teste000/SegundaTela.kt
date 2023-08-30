package com.example.teste000

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.teste000.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {

    private lateinit var authorTextView: TextView
    private lateinit var binding: ActivitySegundaTelaBinding
    private lateinit var textView: TextView
    private lateinit var button: Button

    private val phrases = listOf(
        Phrase("Comece onde você está, use o que você tem e faça o que você pode.","Niponica"),
        Phrase("Coragem é saber o que não temer.","KeikoReturns"),
        Phrase("Conhecer a si mesmo é o começo de toda sabedoria.", "Paternostro"),
        Phrase("Acredite em milagres, mas não dependa deles.", "Yasmim Gama"),
        Phrase("Cada segundo é tempo para mudar tudo para sempre.", "Ploo3o"),
        Phrase("Aprenda com o ontem. Viva o hoje. tenha esperança para o amanhã.", "AnaLuizaJob")
    )


    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener {
            finish()
        }

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        authorTextView = findViewById(R.id.author_TextView)

        button.setOnClickListener {
            if (currentIndex < phrases.size) {
                val currentFrase = phrases[currentIndex]
                textView.text = currentFrase.phrase
                authorTextView.text = currentFrase.author
                currentIndex++
            } else {
                currentIndex = 0
                val currentFrase = phrases[currentIndex]
                    textView.text = currentFrase.phrase
                    authorTextView.text = currentFrase.author
                    currentIndex++
        }
    }
}}

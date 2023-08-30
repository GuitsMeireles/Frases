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
        Phrase("Comece onde você está, use o que você tem e faça o que você pode.","Autor 1"),
        Phrase("Coragem é saber o que não temer.","Autor 2"),
        Phrase("Conhecer a si mesmo é o começo de toda sabedoria.", "Autor 3"),
        Phrase("Acredite em milagres, mas não dependa deles.", "Autor 4"),
        Phrase("Cada segundo é tempo para mudar tudo para sempre.", "Autor 5"),
        Phrase("Aprenda com o ontem. Viva o hoje. tenha esperança para o amanhã.", "Autor 6")
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

                if (currentIndex < phrases.size) {
                    val currentFrase = phrases[currentIndex]
                    textView.text = currentFrase.phrase
                    authorTextView.text = currentFrase.author
                    currentIndex++
                }
        }
    }
}}

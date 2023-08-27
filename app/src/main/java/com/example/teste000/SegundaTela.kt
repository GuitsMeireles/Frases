package com.example.teste000

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.teste000.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaTelaBinding
    private lateinit var textView: TextView
    private lateinit var button: Button

    private val phrases = listOf(
        "Comece onde você está, use o que você tem e faça o que você pode.",
        "Coragem é saber o que não temer.",
        "Conhecer a si mesmo é o começo de toda sabedoria.",
        "Acredite em milagres, mas não dependa deles.",
        "Cada segundo é tempo para mudar tudo para sempre.",
        "Aprenda com o ontem. Viva o hoje. tenha esperança para o amanhã."
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

        button.setOnClickListener {
            if (currentIndex < phrases.size) {
                textView.text = phrases[currentIndex]
                currentIndex++
            } else {
                currentIndex = 0



        }
    }
}}
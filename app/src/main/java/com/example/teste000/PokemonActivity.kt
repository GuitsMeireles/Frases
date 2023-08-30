package com.example.teste000

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.teste000.databinding.ActivityMainBinding
import com.example.teste000.databinding.ActivityPokemonBinding

class PokemonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPokemonBinding
    private lateinit var poke_TextView: TextView
    private lateinit var prox_button: Button

    private val pokemon = listOf(
        Pokemon("Charizard"),
        Pokemon("Garchomp"),
        Pokemon("Litwick"),
        Pokemon("Pikachu"),
        Pokemon("Gothitelle"),
        Pokemon("Gliscor")
    )

    private var currentIndex = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inicioButton.setOnClickListener {
            finish()
        }

        poke_TextView = findViewById(R.id.poke_TextView)
        prox_button = findViewById(R.id.prox_button)

        prox_button.setOnClickListener {
            if (currentIndex < pokemon.size) {
                val currentFrase = pokemon[currentIndex]
                poke_TextView.text = currentFrase.pokemon
                currentIndex++
            } else {
                currentIndex = 0
                val currentFrase = pokemon[currentIndex]
                poke_TextView.text = currentFrase.pokemon
                currentIndex++
            }


    }
}}
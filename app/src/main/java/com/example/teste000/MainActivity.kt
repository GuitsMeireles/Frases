package com.example.teste000

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.teste000.databinding.ActivityMainBinding
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        binding.pokeButton.setOnClickListener {
            val i = Intent(this,PokemonActivity::class.java )
            startActivity(i)

        binding.buttonIr.setOnClickListener {
            val i = Intent(this,SegundaTela::class.java )
            startActivity(i)
        }
    }
}}
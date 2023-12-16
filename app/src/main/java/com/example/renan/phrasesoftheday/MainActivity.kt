package com.example.renan.phrasesoftheday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    private val sentences: List<String> = listOf(
        "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
        "Acredite em você, sempre haverá alguém para duvidar.",
        "O pessimista vê dificuldade em cada oportunidade. O otimista vê oportunidade em cada dificuldade.",
        "A persistência é o caminho do êxito.",
        "Não espere por uma crise para descobrir o que é importante em sua vida.",
        "A jornada de mil milhas começa com um passo.",
        "O que você pode fazer hoje, não deixe para amanhã.",
        "A vida é 10% do que acontece comigo e 90% de como eu reajo a isso.",
        "Não importa o quão devagar você vá, desde que você não pare.",
        "O sucesso é a consequência de um esforço constante."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generateSentences(view: View){
        val index = Random.nextInt(sentences.size)
        val textView: TextView = findViewById(R.id.textView)
        textView.setText(this.sentences[index])
    }
}
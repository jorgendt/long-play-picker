package jorgendrejernorheim.longplaypicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var shuffleButton: Button = findViewById(R.id.button)
        shuffleButton.setOnClickListener {
            suggestAlbum()
        }

        suggestAlbum()
    }

    private fun suggestAlbum() {
        val albums = arrayOf("The Beatles - Abbey Road", "Television - Marquee Moon", "Radiohead - The Bends", "Pink Floyd - Animals")

        val albumTextView: TextView = findViewById(R.id.album)
        albumTextView.text = albums[albums.indices.random()]
    }
}
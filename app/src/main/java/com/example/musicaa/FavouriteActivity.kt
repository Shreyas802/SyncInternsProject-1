package com.example.musicaa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicaa.databinding.ActivityFavouriteBinding

class FavouriteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavouriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.coolPink)
        binding = ActivityFavouriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
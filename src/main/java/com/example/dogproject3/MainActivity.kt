package com.example.dogproject3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.core.net.toUri
import coil.load
import com.yah.ph3project3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: DogViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getRandomDogPhoto()

    }

    fun getRandomDogPhoto () {
        viewModel.dogList.observe(this, {val imgUri = it.last().imageUrl?.toUri()?.buildUpon()?.scheme("https")?.build()
            Log.d("DatabaseLoad", "$it")
            binding.imageView.load(imgUri)})



        val randomPhotoButton = binding.button


        }
    }


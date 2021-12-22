package com.example.dogproject3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import coil.load
import com.example.dogproject3.application.DogImageApp
import com.yah.ph3project3.databinding.ActivityPreviousImageBinding

class PreviousImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreviousImageBinding
    private val viewModel: DogViewModel by viewModels()
//        DogViewModelFactory((application as ImageApp).database.imageDao())
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviousImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}

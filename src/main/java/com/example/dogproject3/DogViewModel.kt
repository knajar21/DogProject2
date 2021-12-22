package com.example.dogproject3


import android.util.Log
import androidx.lifecycle.*
import com.example.dogproject3.application.AppManager
import com.example.dogproject3.network.DogPhoto
import com.example.dogproject3.network.DogPhotoApi
import kotlinx.coroutines.launch

class DogViewModel() : ViewModel() {

    internal val dogList: LiveData<List<DogPhoto>> = getAllPhotos()

    init {
        getNewPhoto()
    }

    fun getNewPhoto() {
        viewModelScope.launch {
            try {
                val dog = DogPhotoApi.retrofitService.getRandomPhoto()
                AppManager.database.imageDao().insertImage(dog)
            } catch (e: Exception) {
                Log.e("DogViewModel", "Error occurred: ${e.message}")
            }
        }
    }

    private fun getAllPhotos(): LiveData<List<DogPhoto>> {
        return AppManager.database.imageDao().getAllImages()
    }
}

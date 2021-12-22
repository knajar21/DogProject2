package com.example.dogproject3.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dogproject3.network.DogPhoto

@Database(entities = [DogPhoto::class], version = 1)
abstract class ImageDatabase : RoomDatabase() {
    abstract fun imageDao(): ImageDao
}
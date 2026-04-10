package com.example.focustoggle_mvvm

class Repository {

    val apiservice = RetrofitInstance.api

    suspend fun getTodos(): List<Todos>{
        return try {
            apiservice.getTodos()
        }catch (e: Exception){
            emptyList()
        }
    }
}
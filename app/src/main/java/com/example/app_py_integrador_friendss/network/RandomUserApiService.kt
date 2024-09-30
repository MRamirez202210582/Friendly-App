package com.example.app_py_integrador_friendss.network

import com.example.app_py_integrador_friendss.communication.ApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserApiService {
    @GET("/api/")
    fun getUsers(@Query("results") results: Int): Call<ApiResponse>
}
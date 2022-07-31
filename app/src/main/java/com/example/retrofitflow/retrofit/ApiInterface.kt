package com.example.retrofitflow.retrofit

import retrofit2.http.GET

interface ApiInterface {

    @GET("")
    fun getAllInfo()

}

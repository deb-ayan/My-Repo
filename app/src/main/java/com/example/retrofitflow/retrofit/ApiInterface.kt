package com.example.retrofitflow.retrofit

import com.example.retrofitflow.model.UserInfo
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("")
    fun getAllInfo(): Response<List<UserInfo>>

}

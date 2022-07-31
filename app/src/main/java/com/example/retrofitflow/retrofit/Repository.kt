package com.example.retrofitflow.retrofit

import com.example.retrofitflow.model.UserInfo
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface Repository {

    fun getAllInfo(): Flow<Response<List<UserInfo>>>

}
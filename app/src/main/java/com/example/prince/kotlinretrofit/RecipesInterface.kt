package com.example.prince.kotlinretrofit

import retrofit2.http.GET
import io.reactivex.Observable

interface RecipesInterface {

    @GET("api/?i=onions,garlic&q=omelet&p=3")
    fun getData() : Observable<JSONResponse>
}
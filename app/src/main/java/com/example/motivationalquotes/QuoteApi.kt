package com.example.motivationalquotes

import com.example.motivationalquotes.model.Quote
import retrofit2.Call
import retrofit2.http.GET

interface QuoteApi {

    // gets a random quote
    @GET("/random")
    fun getRandomQuote() : Call<Quote>

    // gets a single daily quote
    @GET("/today")
    fun getDailyQuote() : Call<Quote>

    // gets a list of 50 quotes in a call
    @GET("/quotes")
    fun getQuotes() : Call<List<Quote>>
}
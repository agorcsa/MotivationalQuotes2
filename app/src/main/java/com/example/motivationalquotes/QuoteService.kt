package com.example.motivationalquotes

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class QuoteService {

    val TAG = "QuoteService"

    private val BASE_URL = "https://zenquotes.io/api"

    private val api: QuoteApi

    init {
        api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuoteApi::class.java)

        GlobalScope.launch(Dispatchers.IO) {
            val randomQuote = api.getRandomQuote()
            val dailyQuote = api.getDailyQuote()
            val quotesList = api.getQuotes()

            Log.d(TAG, dailyQuote.toString())
        }
    }
}
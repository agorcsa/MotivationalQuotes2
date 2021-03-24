package com.example.motivationalquotes.model

import com.google.gson.annotations.SerializedName

data class Quote(
    @SerializedName("q")
    val quoteText: String?,
    @SerializedName("a")
    val author: String?)
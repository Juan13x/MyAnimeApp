package com.example.myanimeapp.models.one_anime


import com.google.gson.annotations.SerializedName

data class MainPicture_AnimeData(
    @SerializedName("large")
    val large: String,
    @SerializedName("medium")
    val medium: String
)
package com.example.myanimeapp.models.airing_animes


import com.google.gson.annotations.SerializedName

data class MainPicture_AiringAnimes(
    @SerializedName("large")
    val large: String,
    @SerializedName("medium")
    val medium: String
)
package com.blas.videoclub.model

import java.io.Serializable

data class Movie (
    val id: Int,
    val name: String,
    val description: String,
    val cover: String,
        ): Serializable


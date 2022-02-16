package com.blas.videoclub.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.blas.videoclub.model.Movie
import com.blas.videoclub.utils.loadImage
import kotlinx.android.synthetic.main.item_movie.view.*

class MoviesViewHolder (view: View): RecyclerView.ViewHolder(view) {
    fun bind(movie: Movie) {
        itemView.movieTitle.text = movie.name
        itemView.movieCover.loadImage(movie.cover)
    }
}
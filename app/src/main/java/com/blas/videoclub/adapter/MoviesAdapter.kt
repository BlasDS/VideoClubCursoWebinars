package com.blas.videoclub.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blas.videoclub.model.Movie
import com.blas.videoclub.utils.inflate
import videoclub.R

class MoviesAdapter : RecyclerView.Adapter<MoviesViewHolder>() {
    private val movieList = arrayListOf<Movie>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view: View = parent.inflate(R.layout.item_movie, attachToRoot = false)
        return MoviesViewHolder(view)
    }

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie: Movie = movieList[position]
        holder.bind(movie)
    }

    public fun  refreshList(movieList: ArrayList<Movie>) {
        this.movieList.addAll(movieList)
        notifyDataSetChanged()
    }
}
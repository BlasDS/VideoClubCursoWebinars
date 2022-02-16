package com.blas.videoclub.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blas.videoclub.adapter.MoviesAdapter
import com.blas.videoclub.model.Movie
import com.blas.videoclub.utils.getJsonFromAssets
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import videoclub.R
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private val TAG = ":::TAG"
    private lateinit var adapter: MoviesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MoviesAdapter()
        recyclerView.adapter = adapter
        adapter.refreshList(getListFromJson())

    }
    private fun getListFromJson(): ArrayList<Movie> {
        val json: String? = getJsonFromAssets("movies.json")
        val movieList: List<Movie> = Gson().fromJson(json, Array<Movie>::class.java).toList()
        return ArrayList(movieList)
    }
}
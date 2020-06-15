package com.miftahun.cabaca.screens


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.miftahun.cabaca.R

/**
 * A simple [Fragment] subclass.
 */
class GenreListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_genre_list, container, false)
        // Inflate the layout for this fragment
        return view
    }


}

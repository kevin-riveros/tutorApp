package kiva.com.pe.tutorapp.controllers.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import kiva.com.pe.tutorapp.R
import kiva.com.pe.tutorapp.controllers.adapters.VideosAdapter
import kiva.com.pe.tutorapp.models.Media
import kotlinx.android.synthetic.main.fragment_feed.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */

class FeedFragment : Fragment() {
    private var media=ArrayList<Media>()
    private lateinit var mediaRecyclerView: RecyclerView
    private lateinit var mediaAdapter: VideosAdapter
    private lateinit var mediaLayoutManager: RecyclerView.LayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val video1 =Media(1,1,"Programacion 1 ","https://www.youtube.com/watch?v=0vTopF6wwZg",1)
        media.add(video1)
        val view = inflater.inflate(R.layout.fragment_feed, container, false)
        mediaAdapter = VideosAdapter(media, view.context)
        mediaLayoutManager = GridLayoutManager(view.context, 1) as RecyclerView.LayoutManager
        mediaRecyclerView = view.mediaRecyclerView
        mediaRecyclerView.adapter = mediaAdapter
        mediaRecyclerView.layoutManager = mediaLayoutManager
        return view
    }
}

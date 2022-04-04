package com.example.myjob

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myjob.adapter.CategoryAdapter

class CategoryFragment : Fragment(R.layout.fragment_category_recycler_view) {

    private lateinit var recycler: RecyclerView
    lateinit var layoutManager: GridLayoutManager
    lateinit var categoryAdapter: CategoryAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler = view.findViewById(R.id.recycler_view)
        recycler.layoutManager = GridLayoutManager(context, 3)
    }
}
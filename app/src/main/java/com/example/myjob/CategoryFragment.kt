package com.example.myjob

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myjob.adapter.CategoryAdapter
import com.example.myjob.model.CategoryItem

class CategoryFragment : Fragment(R.layout.fragment_category_recycler_view) {

    private lateinit var recycler: RecyclerView
    lateinit var categories : MutableList<CategoryItem>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler = view.findViewById(R.id.recycler_view)
        recycler.layoutManager = GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
        createCategories()
        recycler.adapter = CategoryAdapter(categories)
    }

    private fun createCategories(){
        categories =  arrayListOf()
        categories.add(CategoryItem("energy", "energia", 0))
        categories.add(CategoryItem("food", "alimentacao", 0))
        categories.add(CategoryItem("transport", "transporte", 0))
        categories.add(CategoryItem("tax", "impostos", 0))
    }
}
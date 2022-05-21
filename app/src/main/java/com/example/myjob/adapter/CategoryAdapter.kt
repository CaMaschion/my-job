package com.example.myjob.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myjob.R
import com.example.myjob.model.CategoryItem

class CategoryAdapter(
    private val categoryList: List<CategoryItem>):
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val items = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_item_view, parent, false)

        return CategoryViewHolder(items)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        return holder.bindItem(categoryList[position])
    }

    override fun getItemCount() = categoryList.size

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val labelCategory: TextView = itemView.findViewById(R.id.text_category)
        private val labelValue: TextView = itemView.findViewById(R.id.value_category)
        private val shape: View = itemView.findViewById(R.id.shape)
        private val icon: View = itemView.findViewById(R.id.icon_category)
        private val background: View = itemView.findViewById(R.id.background)

        fun bindItem(item: CategoryItem) {
            labelCategory.text = item.category
            labelValue.text = item.categoryValue.toString()
            when (item.category) {
                "Alimentacao" -> background.setBackgroundResource(R.drawable.background_category_pink)
                else -> background

            }
        }
    }
}
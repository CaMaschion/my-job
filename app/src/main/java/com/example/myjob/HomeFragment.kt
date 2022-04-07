package com.example.myjob

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var buttonContinue: AppCompatButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonContinue = view.findViewById(R.id.button_continue)

        buttonContinue.setOnClickListener { view ->
            view.findNavController().navigate(R.id.categoryFragment)
        }
    }
}

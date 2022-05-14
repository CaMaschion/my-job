package com.example.myjob

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputEditText

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var buttonContinue: AppCompatButton
/*    private lateinit var editTextMonth: TextInputEditText
    private lateinit var radioButtonDayOne: RadioButton
    private lateinit var radioButtonDayTwo: RadioButton
    private lateinit var radioButtonDayThree: RadioButton
    private lateinit var radioButtonDayFour: RadioButton
    private lateinit var radioButtonDayFive: RadioButton
    private lateinit var radioButtonDaySix: RadioButton
    private lateinit var radioButtonDaySeven: RadioButton
    private lateinit var editTextVacation: TextInputEditText*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonContinue = view.findViewById(R.id.button_continue)

        buttonContinue.setOnClickListener { view ->
            view.findNavController().navigate(R.id.categoryFragment)
        }
    }

}

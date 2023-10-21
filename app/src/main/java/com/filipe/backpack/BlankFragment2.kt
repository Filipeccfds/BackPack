package com.filipe.backpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.filipe.backpack.databinding.FragmentBlank2Binding
import com.filipe.backpack.databinding.FragmentBlankBinding

class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentBlank2Binding.inflate(inflater,container,false)

        val next = binding.nextScren2
        next.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment2_to_blankFragment3)
        }


        return binding.root
    }
}
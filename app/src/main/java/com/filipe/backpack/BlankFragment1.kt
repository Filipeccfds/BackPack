package com.filipe.backpack

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.filipe.backpack.databinding.FragmentBlankBinding

class BlankFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentBlankBinding.inflate(inflater,container,false)

        val next = binding.nextScren
        next.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment1_to_blankFragment2)
        }
        val stack = binding.stackButton
        stack.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment1_self)
        }

        Log.d("lifeSnake","onCreate")
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("lifeSnake","onAttach")
    }
    override fun onResume() {
        super.onResume()
        Log.d("lifeSnake","onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifeSnake","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifeSnake","onDestroy")
    }
}
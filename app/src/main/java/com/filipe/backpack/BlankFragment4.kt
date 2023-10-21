package com.filipe.backpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.filipe.backpack.databinding.FragmentBlank2Binding
import com.filipe.backpack.databinding.FragmentBlank4Binding

class BlankFragment4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentBlank4Binding.inflate(inflater,container,false)
        val next = binding.backScren
        next.setOnClickListener {
            //nav options e uma formar de fazer com que a ultima tela quando voltar para primeira ela nao empilhe varias telas
            //ou seja nao tenha que apertar mais vezes em voltar para ele sair
            //popup vc define isso usando  o id da tela que voce quer resetar , no incluse vc informar se que que a tela
            //seja tirada da pilha de tela e sevestate para saber se vc quer salvaro estado
            //
            val navOptions = NavOptions.Builder().setPopUpTo(R.id.blankFragment1,true,false).build()
            val action = BlankFragment4Directions.actionBlankFragment4ToBlankFragment1()
            findNavController().navigate(action,navOptions)
        }

        return binding.root
    }
}
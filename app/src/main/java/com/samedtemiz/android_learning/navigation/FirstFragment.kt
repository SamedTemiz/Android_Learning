package com.samedtemiz.android_learning.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.samedtemiz.android_learning.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnGoToSecond.setOnClickListener{
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(binding.txtPlaintData.text.toString())
            findNavController().navigate(action)
        }

        binding.btnGoToBottomNav.setOnClickListener{
            val action = FirstFragmentDirections.actionFirstFragmentToNewActivity()
            findNavController().navigate(action)
        }
    }
}
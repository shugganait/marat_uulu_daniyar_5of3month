package com.kg.marat_uulu_daniyar_5of3month

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kg.marat_uulu_daniyar_5of3month.databinding.FragmentEndingBinding

class EndingFragment : Fragment() {
    private lateinit var binding: FragmentEndingBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEndingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result = arguments?.getInt("KEY")
        binding.tvResult.text = "$result"
    }
}
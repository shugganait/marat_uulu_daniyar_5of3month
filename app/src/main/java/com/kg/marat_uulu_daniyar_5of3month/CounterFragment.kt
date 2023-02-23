package com.kg.marat_uulu_daniyar_5of3month

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kg.marat_uulu_daniyar_5of3month.databinding.FragmentCounterBinding

class CounterFragment : Fragment() {
    private lateinit var binding: FragmentCounterBinding
    private var count = 0
    private var isReadyToMinus = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCounterBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOperation.setOnClickListener {
            if (!isReadyToMinus){
                count++
                binding.tvCount.text = "$count"
                if (count == 10){
                    isReadyToMinus = true
                    binding.btnOperation.text = "-1"
                }
            } else if (isReadyToMinus){
                count--
                binding.tvCount.text = "$count"
                if (count == 0){
                    isReadyToMinus = false
                    binding.btnOperation.text = "+1"
                    val bundle: Bundle = Bundle()
                    bundle.putInt("KEY", count)
                    val endingFragment: EndingFragment = EndingFragment()
                    endingFragment.arguments = bundle
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.container_fragment, endingFragment).addToBackStack(null).commit()
                }

            }
        }
    }
}
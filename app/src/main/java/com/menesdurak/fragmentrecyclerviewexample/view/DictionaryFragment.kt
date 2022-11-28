package com.menesdurak.fragmentrecyclerviewexample.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.menesdurak.fragmentrecyclerviewexample.R
import com.menesdurak.fragmentrecyclerviewexample.data.Word
import com.menesdurak.fragmentrecyclerviewexample.databinding.FragmentDictionaryBinding

class DictionaryFragment : Fragment() {
    private var _binding: FragmentDictionaryBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDictionaryBinding.inflate(inflater, container, false)
        val view = binding.root

        val wordList = ArrayList<Word>()

        val word1 = Word("Blue", "Mavi")
        val word2 = Word("Red", "Kırmızı")
        val word3 = Word("Yellow", "Sarı")
        val word4 = Word("Blue", "Mavi")
        val word5 = Word("Red", "Kırmızı")
        val word6 = Word("Yellow", "Sarı")
        val word7 = Word("Blue", "Mavi")
        val word8 = Word("Red", "Kırmızı")
        val word9 = Word("Yellow", "Sarı")

        wordList.add(word1)
        wordList.add(word2)
        wordList.add(word3)
        wordList.add(word4)
        wordList.add(word5)
        wordList.add(word6)
        wordList.add(word7)
        wordList.add(word8)
        wordList.add(word9)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.menesdurak.fragmentrecyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.menesdurak.fragmentrecyclerviewexample.R
import com.menesdurak.fragmentrecyclerviewexample.data.Word
import com.menesdurak.fragmentrecyclerviewexample.databinding.ItemListBinding

class WordAdapter(private val wordList: ArrayList<Word>) : RecyclerView.Adapter<WordAdapter.WordHolder>() {
    class WordHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context))
        return WordHolder(binding)
    }

    override fun onBindViewHolder(holder: WordHolder, position: Int) {
        holder.binding.tvName.text = wordList[position].name
        holder.binding.tvMeaning.text = wordList[position].meaning
    }

    override fun getItemCount(): Int = wordList.size
}
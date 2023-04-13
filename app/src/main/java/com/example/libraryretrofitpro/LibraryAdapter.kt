package com.example.libraryretrofitpro

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.libraryretrofitpro.data.Library
import com.example.libraryretrofitpro.data.Row
import com.example.libraryretrofitpro.databinding.ItemViewBinding

class LibraryAdapter(val libraryList: MutableList<LibraryData>) :RecyclerView.Adapter<LibraryAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val binding= ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CustomViewHolder(binding)
    }

    override fun getItemCount(): Int = libraryList.size


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val binding = holder.binding
        binding.tvGuCode.text = libraryList.get(position).code
        binding.tvLbName.text = libraryList.get(position).name
        binding.tvTelNo.text = libraryList.get(position).phone
        binding.tvAddress.text = libraryList.get(position).address
        binding.tvLatitude.text = libraryList.get(position).latitude
        binding.tvLongitude.text = libraryList.get(position).longitude

    }


class CustomViewHolder(val binding: ItemViewBinding): RecyclerView.ViewHolder(binding.root)
}


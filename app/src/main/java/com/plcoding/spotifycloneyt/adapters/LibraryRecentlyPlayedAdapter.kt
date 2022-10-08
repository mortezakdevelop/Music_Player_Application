package com.plcoding.spotifycloneyt.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.plcoding.spotifycloneyt.R
import com.plcoding.spotifycloneyt.data.entities.Song
import com.plcoding.spotifycloneyt.databinding.LibraryItemBinding

class LibraryRecentlyPlayedAdapter :
    RecyclerView.Adapter<LibraryRecentlyPlayedAdapter.ViewHolder>() {

    private val dataList = ArrayList<Song>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LibraryRecentlyPlayedAdapter.ViewHolder {
        val libraryItemBinding: LibraryItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.library_item, parent, false
        )
        return ViewHolder(libraryItemBinding)
    }

    override fun onBindViewHolder(holder: LibraryRecentlyPlayedAdapter.ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    inner class ViewHolder(private var binding: LibraryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(song: Song) {
            binding.ivImage.context?.let {
                Glide.with(it)
                    .load(song.imageUrl)
                    .into(binding.ivImage)
            }
        }
    }
}

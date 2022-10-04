package com.plcoding.spotifycloneyt.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.plcoding.spotifycloneyt.R
import com.plcoding.spotifycloneyt.data.entities.Song
import com.plcoding.spotifycloneyt.databinding.SongImageSliderItemBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


class SongImageSliderAdapter():RecyclerView.Adapter<SongImageSliderAdapter.ImageViewHolder>() {

    private val dataList = ArrayList<Song>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SongImageSliderAdapter.ImageViewHolder {
        val binding =
            SongImageSliderItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SongImageSliderAdapter.ImageViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun addAll(list: ArrayList<Song>) {
        dataList.addAll(list)
        notifyItemRangeInserted(0, list.size)

    }

    inner class ImageViewHolder(private val binding:SongImageSliderItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(song: Song) {
            binding.rivImage.context?.let {
                Glide.with(it)
                    .load(song.imageUrl)
                    .into(binding.rivImage)
            }
        }

    }
}
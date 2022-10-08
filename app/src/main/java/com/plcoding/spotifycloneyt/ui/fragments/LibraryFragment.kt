package com.plcoding.spotifycloneyt.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.RequestManager
import com.plcoding.spotifycloneyt.R
import com.plcoding.spotifycloneyt.databinding.FragmentLibraryBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LibraryFragment : Fragment() {

    @Inject
    lateinit var glide:RequestManager


    lateinit var fragmentLibraryBinding: FragmentLibraryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentLibraryBinding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_library,container,false)
        return fragmentLibraryBinding.root
    }
}
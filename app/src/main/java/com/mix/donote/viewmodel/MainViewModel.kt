package com.mix.donote.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mix.donote.model.Blog

/**
 * Created on : June 16, 2019
 * Author     : Ryan Godlonton-Shaw
 */

class MainViewModel : ViewModel() {

    val movieRepository= BlogRepository()
    val allBlog: LiveData<List<Blog>> get() = movieRepository.getMutableLiveData()

    override fun onCleared() {
        super.onCleared()
        movieRepository.completableJob.cancel()
    }
}
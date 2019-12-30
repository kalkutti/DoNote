package com.mix.donote.fragment

import android.os.Bundle
import com.mix.donote.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.mix.donote.CategAdapter
import com.mix.donote.Country
import com.mix.donote.CountrySeed
import kotlinx.android.synthetic.main.fragment_items.*

class ItemsFragment : BaseFragment(){

    override fun getLayout() = R.layout.fragment_items

    companion object {
        fun newInstance() = ItemsFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        getPopularBlog()

    }

    fun getPopularBlog() {

        prepareRecyclerView(CountrySeed().seed())

    }

    private fun prepareRecyclerView(categList: List<Country>?) {

        recyclercateg.apply {
            // RecyclerView
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = CategAdapter(categList)
        }

    }
}
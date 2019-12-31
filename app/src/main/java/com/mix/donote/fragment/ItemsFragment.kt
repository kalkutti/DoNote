package com.mix.donote.fragment

import android.content.res.Configuration
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.mix.donote.R
import androidx.recyclerview.widget.LinearLayoutManager
import com.mix.donote.CategAdapter
import com.mix.donote.Country
import com.mix.donote.CountrySeed
import com.mix.donote.model.Blog
import com.mix.donote.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_items.*

class ItemsFragment : BaseFragment(){

    var mainViewModel: MainViewModel? = null
    var mBlogAdapter: CategAdapter? = null

    override fun getLayout() = R.layout.fragment_items

    companion object {
        fun newInstance() = ItemsFragment()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        getPopularBlog()

    }

    fun getPopularBlog() {

        //prepareRecyclerView(CountrySeed().seed())
        mainViewModel!!.allBlog.observe(this, Observer {  blogList ->
            prepareRecyclerView(blogList)
        })

    }

    private fun prepareRecyclerView(categList: List<Blog>?) {

        recyclercateg.apply {
            // RecyclerView
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = CategAdapter(categList)
        }

    }
}
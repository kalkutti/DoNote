package com.mix.donote

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mix.donote.model.Blog

class CategAdapter(val categList: List<Blog>?) : RecyclerView.Adapter<CategAdapter.ViewHolder>() {


    override fun getItemCount() = categList!!.size

    private var mContext: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        this.mContext=parent.context

        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.singlelistitem,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val mCateg = categList!!.get(position)

        if (mCateg.title != null) {
            holder.tvDes.setText(mCateg.title)
        }
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvDes: TextView = itemView.findViewById(R.id.tv_desc)
    }
}
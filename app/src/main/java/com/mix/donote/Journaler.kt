package com.mix.donote

import android.app.Application
import android.content.Context

class Journaler : Application(){

    companion object{
        var ctx: Context? = null
    }

    override fun onCreate(){
        super.onCreate()
        ctx = applicationContext
    }
}
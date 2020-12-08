package com.lph.commonutils

import android.app.Application
import com.tencent.mmkv.MMKV

/**
 * LCU  is short for Lph Common Utils
 */
class LCU {



    companion object{
        fun init(app:Application){
             var INSTANCE: Application =app
            initMMKV(app)
        }

        private fun initMMKV(app: Application) {
            MMKV.initialize(app.filesDir.absolutePath + "/mmkv")
        }
    }






}
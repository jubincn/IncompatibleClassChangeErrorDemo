package tech.jubin.android.demo.visibilitycrashdemo.entity

import android.util.Log

class ChildKotlinParentKotlin: ParentKotlin() {
    companion object {
        private const val TAG = "ChildKotlinParentKotlin"
    }

    fun log() {
        Log.w(TAG, "ChildKotlinParentKotlin()")
    }
}
package tech.jubin.android.demo.visibilitycrashdemo.entity

import android.util.Log

class ChildKotlin: ParentJava() {
    private val TAG = "CHILD KOTLIN"

    fun log() {
        Log.d(TAG, "CHILD KOTLIN")
    }

}
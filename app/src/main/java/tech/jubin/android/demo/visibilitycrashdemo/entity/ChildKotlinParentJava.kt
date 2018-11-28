package tech.jubin.android.demo.visibilitycrashdemo.entity

import android.util.Log

class ChildKotlinParentJava : ParentJava() {
    private val TAG = "ChildKotlinParentJava"

    fun log() {
        Log.d(TAG, "ChildKotlinParentJava")
    }
}
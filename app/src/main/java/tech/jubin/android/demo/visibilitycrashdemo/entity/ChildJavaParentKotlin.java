package tech.jubin.android.demo.visibilitycrashdemo.entity;


import android.util.Log;

public class ChildJavaParentKotlin extends ParentKotlin {
    private final String TAG = "ChildJavaParentKotlin";

    public void log() {
        Log.w(TAG, "ChildJavaParentKotlin");
    }
}

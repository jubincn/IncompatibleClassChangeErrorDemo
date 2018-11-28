package tech.jubin.android.demo.visibilitycrashdemo.entity;

import android.util.Log;

public class ChildJavaParentJava extends ParentJava {
    private final String TAG = "ChildJavaParentJava";

    public void log() {
        Log.d(TAG, "ChildJavaParentJava");
    }
}

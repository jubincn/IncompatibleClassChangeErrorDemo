package tech.jubin.android.demo.visibilitycrashdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import tech.jubin.android.demo.visibilitycrashdemo.entity.ChildKotlinParentKotlin
import tech.jubin.android.demo.visibilitycrashdemo.entity.ChildJavaParentKotlin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val childKotlin = ChildKotlinParentKotlin()
        tv_hello_kotlin_parent_java.setOnClickListener {
            childKotlin.log()
        }

        val childJava = ChildJavaParentKotlin()
        tv_hello_java_parent_java.setOnClickListener{
            childJava.log()
        }


    }
}

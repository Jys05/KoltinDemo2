package com.sjy.koltindemo2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotterknife.bindView

class MainActivity : AppCompatActivity() {

    val tv: TextView by bindView(R.id.tv)
    val map = mutableMapOf<String, String>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setText("sakdnas");
        ifTest("jabvskjd");
        forTest(null);
        whenTest(6);
        foo(1646);
        filter()
        map.put("ss", "sss")
        map.put("ss1", "sss1")
        map.put("ss2", "sss2")
        map.put("ss3", "sss3")
        for ((k, v) in map) {
            println("$k -> $v")
        }

        map.mapValues { (key, value) -> println("$key is $value") }
        val map2 = map.filter { (key, value) -> value.length > 3 }
        map2.mapValues { (key, value) -> println("map2 ===>  $key is $value") }
    }


    fun foo(a: Int = 0) {
        println(a)
    }


    fun filter() {
        val h = listOf<Int>(1, 2, 2, 3, 45, 6, 7, 89, 0, 0);
        val h2 = listOf<String>("sbj", "as", "a");
        val r = h.filter { item -> item > 4 }
        val r2 = h.filter { it > 8 }
        val r3 = h2.filter { it.length > 2 }
        for ((index, value) in h.withIndex()) {
            println("==过滤前===> $index is $value")
        }
        for ((index, value) in r.withIndex()) {
            println("==过滤后===> $index is $value")
        }
        for ((index, value) in r2.withIndex()) {
            println("==过滤后===> $index is $value")
        }
        for ((index, value) in r3.withIndex()) {
            println("==过滤后===> $index is $value")
        }
    }

    fun onTVClick(v: View) {
        Toast.makeText(this, "n", Toast.LENGTH_SHORT).show()
    }

    fun ifTest(xixi: Any) {
        if (xixi is String) {
            Toast.makeText(this, xixi, Toast.LENGTH_SHORT).show();
        }
    }

    fun forTest(list: ArrayList<String>?) {
        var items = listOf<String>("basj", "jka", "kjasb");
        for (item in items) {
            println("xixi is $item")
        }
        for ((index, value) in items.withIndex()) {
            println("the element at $index is $value")
        }
    }


    fun whenTest(i: Int) {
        when (i) {
            1 -> println("whenResult is 1")
            2 -> println("whenResult is 2")
            3 -> println("whenResult is 3")
            4 -> println("whenResult is 4")
            in 5..10 -> println("whenResult is 5到10")
            !in 10..20 -> println("whenResult is not 10到20")
            else ->
                print("null")

        }
    }
}

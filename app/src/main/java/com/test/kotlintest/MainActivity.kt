package com.test.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.kotlintest.bean.Greeter
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(a: Int, b: Int): Int {
        //条件语句
        var max = if (a < b) {
            b
        } else {
            a
        }
        val items = listOf(1, 2, 3, 4, 5)
        for (item in items) {
            print(item)
        }
        for (index in items.indices) {
            print("item at $index is ${items[index]}")
        }
        print("max value =$max")
        return max
    }

    fun sum1(a: Int, b: Int) = a + b


    fun hasPreFix(x: Any) = when (x) {
        is String -> x.startsWith("prefix")
        else -> false
    }

}
fun main(args: Array<String>) {
    Greeter("Centerm").greet()
//    print(MainActivity.sum(1, 2))
    val x = 5
    val y = 9
    if (x in 1..8) {
        print("x 在区间内")
    }
    if (y in 1..8) {
        print("y 在区间内")
    }

}
package com.test.kotlintest.bean

import com.test.kotlintest.infer.MyInterface

class Child:MyInterface {
    override fun bar() {
        println("fun bar")
    }
}
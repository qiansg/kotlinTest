package com.test.kotlintest.bean

class Person {
    var lastName: String = "zhang"
        get() = field.toUpperCase()
        set

    var no: Int = 100
        get() = field
        set(value) {
            field = if (value < 10) {
                value
            } else {
                -1
            }
        }
    var height: Float = 160.0f
        private set
}
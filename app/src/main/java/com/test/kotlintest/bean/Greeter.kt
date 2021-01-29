package com.test.kotlintest.bean

class Greeter(val name: String) {
    fun greet() {
        println("hello,say welcome to $name")
    }

}

fun main(args: Array<String>) {
    Greeter("Centerm").greet()
    val items = listOf("apple", "banana", "flower")
    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    var x = 5
    while (x > 0) {
        println(x--)
    }
    var y = 0
    do {
        println(y++)
    } while (y < 5)

    for (i in 1..10) {
        if (i == 3)
            continue
        println(i)
        if (i > 5) {
            break
        }
    }
    var person = Person()
    person.lastName = "qiansg"
    println("the lastname is ${person.lastName}")
    person.no = 9
    println("the no is ${person.no}")
    person.no = 20
    println("the no is ${person.no}")

    var runoob = Runoob("菜鸟教程",1)
    println(runoob.url)
    println(runoob.country)
    println(runoob.siteName)
    runoob.printTest()

    val child=Child()
    child.bar()
    child.foo()
}
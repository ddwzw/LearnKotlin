package com.learnkotlin

fun main() {
    val name = "World"
    println("Hello $name!")
    printInt(sum(0, 1), sum3(2, 3))
    printInt(1, 2, 3, 4, 5)
    var sumLambda: (Int, Int) -> Int = {x, y -> x + y}
    println(sumLambda(1, 2))
}

fun printInt(min : Int, max : Int) {
    if (min > max) {
        println("min > max")
        return
    }
    for (i in min..max) {
        println("i = $i")
    }
}

fun sum(a : Int, b : Int) : Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b


public fun sum3(a: Int, b: Int) = a + b

//  如果是返回 Unit类型，则可以省略
fun printString(a : String) : Unit {
    println("string is $a")
}

fun printInt(vararg ints: Int) {
    for (i in ints) {
        print("i is $i");
    }
}

class Person() {}
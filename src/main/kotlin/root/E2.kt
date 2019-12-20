package root

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        println("1")
        delay(1000L)
        println("World!")
    }
    GlobalScope.launch {
        println("2")
        delay(2000L)
        println("3")
    }
    println("Hello,")
    runBlocking {
        println("4")
         delay(3000L)
        println("5")
     }
    println("Done!")
}
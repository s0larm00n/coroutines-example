package root

import kotlinx.coroutines.*

fun main() = runBlocking{
    val job1 = GlobalScope.launch {
        println("1")
        delay(1000L)
        println("World!")
    }
    val job2 = GlobalScope.launch {
        println("2")
        delay(2000L)
        println("3")
    }
    println("Hello,")
    job1.join()
    job2.join()
    println("Done!")
}
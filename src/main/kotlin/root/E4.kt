package root

import kotlinx.coroutines.*

fun main() {
    a()
    println("Done!")
}

@ExperimentalCoroutinesApi
fun a() = runBlocking{
    launch(newSingleThreadContext("MyOwnThread")) { // thread
        println("1")
        delay(1000L)
        println("World!")
    }
    launch {
        println("2")
        delay(2000L)
        println("3")
    }
    println("Hello,")
}
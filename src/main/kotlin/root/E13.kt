package root

import kotlinx.coroutines.*
import kotlin.system.*

fun main() = runBlocking {

    /*val time = measureTimeMillis {
        val one = doSomethingUsefulOne()
        val two = doSomethingUsefulTwo()
        println("The answer is ${one + two}")
    }
    println("Completed in $time ms")
*/
    /*val time = measureTimeMillis {
        val one = async { doSomethingUsefulOne() }
        val two = async { doSomethingUsefulTwo() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
*/
    /*val time = measureTimeMillis {
        val one = async { doSomethingUsefulOne() }
        val two = async { doSomethingUsefulTwo() }
        println("The answer is ${one.getCompleted() + two.getCompleted()}")
    }
    println("Completed in $time ms")*/

    /*val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
        val two = async(start = CoroutineStart.LAZY) { doSomethingUsefulTwo() }
        // some computation
        one.start() // start the first one
        two.start() // start the second one
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")*/
}

suspend fun doSomethingUsefulOne(): Int {
    println("One1")
    delay(1000L) // pretend we are doing something useful here
    println("One2")
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    println("Two1")
    delay(1000L) // pretend we are doing something useful here, too
    println("Two2")
    return 29
}
package org.tix

import kotlinx.coroutines.runBlocking
import org.tix.builder.tixForCLI

fun main(args: Array<String>) {
    println(args.first())
    runBlocking {
        val tix = tixForCLI()
        val viewModel = tix.plan.planViewModel()
    }
}
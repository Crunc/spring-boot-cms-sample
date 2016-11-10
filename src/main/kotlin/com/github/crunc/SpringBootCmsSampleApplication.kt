package com.github.crunc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringBootCmsSampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootCmsSampleApplication::class.java, *args)
}

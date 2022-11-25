package de.claudioaltamura.kotlin.springboot.rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootRestApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootRestApplication>(*args)
}

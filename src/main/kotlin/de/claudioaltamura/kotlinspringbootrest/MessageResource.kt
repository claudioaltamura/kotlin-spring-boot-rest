package de.claudioaltamura.kotlinspringbootrest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource {
    @GetMapping
    fun index(): List<Message> = listOf(
            Message("1", "Hello!"),
            Message("2", "Ciao!"),
            Message("3", "Moin!"),
    )
}


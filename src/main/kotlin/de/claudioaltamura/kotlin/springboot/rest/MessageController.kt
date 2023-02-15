package de.claudioaltamura.kotlin.springboot.rest

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class MessageController(val service: MessageService) {
    @GetMapping
    fun index(): List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }
}


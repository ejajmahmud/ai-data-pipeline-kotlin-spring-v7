package com.enterprise

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@RestController
class SystemController {
    @GetMapping("/api/health")
    fun health(): Map<String, String> = mapOf(
        "system" to "ai-data-pipeline-kotlin-spring-v7",
        "stack" to "Kotlin / Spring Boot",
        "status" to "ACTIVE"
    )
}

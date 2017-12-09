package io.github.gedorinku.ktorapp

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing

/**
 * Created by gedorinku on 2017/12/09.
 */
fun Application.sampleApplication() {
    routing {
        get("/") {
            call.respondText("Hello")
        }
    }
}
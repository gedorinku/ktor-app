package io.github.gedorinku.ktorapp

import io.ktor.application.Application
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by gedorinku on 2017/12/09.
 */
class ApplicationTest {

    @Test fun testHello() = withTestApplication(Application::sampleApplication) {
        handleRequest(HttpMethod.Get, "/").run {
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals("Hello", response.content)
        }
    }
}
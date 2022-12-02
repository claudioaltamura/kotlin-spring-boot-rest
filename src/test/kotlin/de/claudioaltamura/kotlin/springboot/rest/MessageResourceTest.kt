package de.claudioaltamura.kotlin.springboot.rest

import org.junit.jupiter.api.Test
import org.skyscreamer.jsonassert.JSONAssert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get

@WebMvcTest(controllers = [MessageController::class])
class MessageResourceTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @MockBean
    private lateinit var messageService: MessageService

    @Test
    fun test() {
        mockMvc
            .perform(
                get(
                    "/"
                ).contentType(MediaType.APPLICATION_JSON)
            )
            .andExpect {
                JSONAssert.assertEquals(
                    "[]",
                    it.response.contentAsString,
                    false
                )
            }
    }

}
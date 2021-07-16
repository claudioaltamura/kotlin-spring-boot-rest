package de.claudioaltamura.kotlinspringbootrest

import org.junit.jupiter.api.Test
import org.skyscreamer.jsonassert.JSONAssert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get

@WebMvcTest(controllers = [MessageResource::class])
class MessageResourceTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

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
                    "[{\"id\":\"1\",\"text\":\"Hello!\"},{\"id\":\"2\",\"text\":\"Ciao!\"},{\"id\":\"3\",\"text\":\"Moin!\"}]",
                    it.response.contentAsString,
                    false
                )
            }
    }
}
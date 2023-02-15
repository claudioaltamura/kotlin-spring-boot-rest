package de.claudioaltamura.kotlin.springboot.rest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(classes = [KotlinSpringBootRestApplication::class],
	webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class KotlinSpringBootRestApplicationTests {

	@Autowired
	lateinit var testRestTemplate: TestRestTemplate

	@Test
	fun shouldReturnEmptyArray() {
		val result = testRestTemplate
			.getForEntity("/", Array<Message>::class.java)

		assertNotNull(result)
		assertEquals(HttpStatus.OK, result?.statusCode)
	}

}

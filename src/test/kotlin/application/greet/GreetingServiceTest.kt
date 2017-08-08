package application.greet

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
open class GreetingServiceTest {
    var greetingService = GreetingService()

    @Test
    fun greet_WithNameExpectName() {
        val expected = "Hello Brian"

        val actual = greetingService.greet("Brian")

        assert(expected == actual)
    }
}
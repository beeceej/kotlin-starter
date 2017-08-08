package application.greet

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(
        val greetingService: GreetingService){

    @GetMapping("/greet")
    fun greet():String {
      return greetingService.greet("Brian Jones")
    }
}
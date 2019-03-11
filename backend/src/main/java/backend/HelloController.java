package backend;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/")
public class HelloController {

    @Get("/hello/{name}")
    public String hello(String name) {
        return "Hello " + name;
    }
}
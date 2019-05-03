package backend;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/")
public class HelloController {

    Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Get("/hello/{name}")
    public String hello(String name) {
        LOG.debug("Generating Greeting For {}.", name);
        return "GCP Hello " + name;
    }
}
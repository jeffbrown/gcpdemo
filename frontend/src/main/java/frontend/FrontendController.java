package frontend;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class FrontendController {

    private BackendClient backendClient;

    public FrontendController(BackendClient backendClient) {
        this.backendClient = backendClient;
    }

    @Get("/hello/{name}")
    public String hello(String name) {
        return backendClient.hello(name).toUpperCase();
    }
}

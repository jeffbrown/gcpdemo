package frontend;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/")
public class FrontendController {

    static final Logger LOG = LoggerFactory.getLogger(FrontendController.class);

    private BackendClient backendClient;

    public FrontendController(BackendClient backendClient) {
        this.backendClient = backendClient;
    }

    @Get("/hello/{name}")
    public String hello(String name) {
        LOG.debug("Received Request For {}.", name);
        return backendClient.hello(name).toUpperCase();
    }
}

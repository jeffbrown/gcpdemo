package frontend;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("${backend.url}")
public interface BackendClient {

    @Get("/hello/{name}")
    String hello(String name);
}

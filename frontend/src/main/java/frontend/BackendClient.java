package frontend;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("https://mn-backend-dot-oci-micronaut.appspot.com")
public interface BackendClient {

    @Get("/hello/{name}")
    String hello(String name);
}

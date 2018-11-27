package micronaut.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/new")
public class NewController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}
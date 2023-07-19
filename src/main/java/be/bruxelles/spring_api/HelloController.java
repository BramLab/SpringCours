package be.bruxelles.spring_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final be.bruxelles.spring_api.StringService service;

    public HelloController(be.bruxelles.spring_api.StringService service){
        this.service = service;
    }

    // GET
    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }
    @GetMapping("/helloworld")
    public String toUpperCase(){
        return service.toUpperCase( "hello world" );
    }


}
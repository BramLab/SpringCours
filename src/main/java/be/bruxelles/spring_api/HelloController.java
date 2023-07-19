package be.bruxelles.spring_api;

import org.springframework.web.bind.annotation.*;

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
    public String helloworld(){
        return service.toUpperCase( "hello world" );
    }

    @GetMapping("/toUpperCase")
    public String toUpperCase(@RequestParam String message){
        return service.toUpperCase( message );
    }

    @GetMapping("/strings/{index}")
    public String getString(@PathVariable int index){
        return service.get(index);
    }

    @PostMapping("/strings/add")
    public void add(@RequestBody AddInfoDTO dto){
        service.add(dto.getIndex(), dto.getMessage());
    }



}
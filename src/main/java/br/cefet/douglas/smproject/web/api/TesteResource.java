package br.cefet.douglas.smproject.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class TesteResource {

    @GetMapping(path = "/echo")
    public String getEcho(){
        return "Echo 1.. 2.. 3..";
    }

    @GetMapping(path = "/hello/{name}")
    public String helloApp(@PathVariable String name){
        return "Hello " + name;
    }

}

package cat.itacademy.barcelonactiva.liz.montse.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String hello(@RequestParam(defaultValue = "unknown") String name){
        return "Hola, " + name + ". Estàs executant un projecte Gradle.";
    }
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String hello2(@PathVariable(required = false) String name) {
        if (name == null) {
            name = "unknown";
        }
        return "Hola, " + name + ". Estàs executant un projecte Gradle.";
    }
}
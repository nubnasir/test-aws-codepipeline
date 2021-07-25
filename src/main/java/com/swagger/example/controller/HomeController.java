package com.swagger.example.controller;

import com.swagger.example.model.ClientInput;
import com.swagger.example.model.ClientMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ClientMessage home() {
        return new ClientMessage("this is home");
    }

    @GetMapping("/message/{message}")
    @ResponseStatus(HttpStatus.OK)
    public ClientMessage message(@PathVariable String message) {
        return new ClientMessage(message);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/client")
    public ClientMessage clientMessage(@RequestBody ClientInput clientInput) {
        return new ClientMessage("Test message");
    }
}

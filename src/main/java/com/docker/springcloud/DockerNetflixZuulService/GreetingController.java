package com.docker.springcloud.DockerNetflixZuulService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GreetingController")
public class GreetingController {
	GreetingService greetingService;

    public GreetingController(@Autowired GreetingService greetingService) {
        this.greetingService=greetingService;
    }

    @GetMapping("/greet")
    //@Produces(MediaType.APPLICATION_JSON)
    public String getGreeting() throws Exception {
        return greetingService.getServiceGreeting();
    }
}

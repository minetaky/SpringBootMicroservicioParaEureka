package com.docker.springcloud.DockerNetflixZuulService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Autowired
    private Environment env;

    @Override
    public String getServiceGreeting() throws Exception {
        String portValue = env.getProperty("server.port");
        String returnValue = "Something unexpected happened, no greeting for you";
        if(portValue!= null && !portValue.isEmpty()) {
            returnValue = new StringBuilder().append("Hello from port: ").append(portValue).append("n").toString();
        }
        return returnValue;
    }

}

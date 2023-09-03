package com.futurecollars.serverdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TextController {

    @GetMapping("/test")
    public String getTestRequest(@RequestParam String name, @RequestParam String surname, @RequestParam List<Integer> grades) {

        System.out.println("getTestRequest " + name + surname + grades);
        return "Hello " + name.toUpperCase() + " " + surname.toUpperCase() + " " + grades + " !! :)";

//        System.out.println("getTestRequest()");
//        return "Hello user!! :)";


    }

    @GetMapping("/bye")
    public String getByeRequest() {
        System.out.println("getByeRequest()");
        return "Bye Bye user!! :(";
    }


    @GetMapping("/echo")
    public String getEchoRequest(@RequestParam String text) {
        System.out.println("getEchoRequest: " + text);
        String response = text.toUpperCase();
        System.out.println("Sending back: " + response);
        return response;
    }

    @GetMapping("/sum")
    public int getIntegersSumRequest(@RequestParam List<Integer> numbers) {
        System.out.println("getIntegersSumRequest: " + numbers);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sending back: " + sum);
        return sum;
    }
}

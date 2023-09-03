package lesson12Task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @GetMapping("/echo")
    public String getEchoRequest(@RequestParam String text) {
        System.out.println("getEchoRequest: " + text);
        String response = text.toUpperCase();
        System.out.println("Sending back: " + response);
        return response;
    }
}

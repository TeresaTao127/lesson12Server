package lesson12Task3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class SumController {
    @GetMapping("/sum")
    public int getIntegersSumRequest(@RequestParam List<Integer> numbers) {
        System.out.println("getIntegersSumRequest: " + numbers);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sending back: " + sum);
        return sum;
    }
}

package com.example.calc.Controller;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class NumberController {

    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        int c = a + b;
        System.out.println("c=" + c);
        return c;

    }
	@GetMapping("/sub")
    public int sub(@RequestParam("a") int a, @RequestParam("b") int b) {
        int c = a - b;
        System.out.println("c=" + c);
        return c;

    }
	@GetMapping("/mul")
    public int mul(@RequestParam("a") int a, @RequestParam("b") int b) {
        int c = a * b;
        System.out.println("c=" + c);
        return c;

    }
	@GetMapping("/div")
    public int div(@RequestParam("a") int a, @RequestParam("b") int b) {
        int c = a % b;
        System.out.println("c=" + c);
        return c;

    }
}
package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController {
          @GetMapping("/welcome")
		  public String Welcome()
          {
               return "Welcome String Boot!";
          }


}

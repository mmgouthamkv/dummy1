package com.example.servicea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ServiceAController {
   @Autowired
   private RestTemplate restTemplate;
   @GetMapping("/service-a")
   public String callServiceB() {
       // Call to ServiceB
       String url = "http://localhost:8081/service-b";
       ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
       return "Response from ServiceB: " + response.getBody();
   }
}

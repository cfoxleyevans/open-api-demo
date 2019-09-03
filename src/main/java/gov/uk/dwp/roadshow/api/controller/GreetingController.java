package gov.uk.dwp.roadshow.api.controller;

import gov.uk.dwp.roadshow.api.model.GreetingDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @GetMapping("/greeting")
  public GreetingDTO getGreeting() {
    return GreetingDTO.builder().greeting("Hello caller").build();
  }

  @GetMapping("/greeting/{name}")
  public GreetingDTO getCustomisedGreeting(@PathVariable("name") final String name) {
    return GreetingDTO.builder().greeting("Hello " + name).build();
  }
}

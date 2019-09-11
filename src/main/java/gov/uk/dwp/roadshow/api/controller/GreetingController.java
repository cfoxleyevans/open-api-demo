package gov.uk.dwp.roadshow.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.dwp.roadshow.generated.rest.model.GreetingDTO;

@RestController
public class GreetingController {

  @GetMapping("/greeting")
  public GreetingDTO getGreeting() {
    var dto = new GreetingDTO();
    dto.setGreeting("Hello caller");

    return dto;
  }

  @GetMapping("/greeting/{name}")
  public GreetingDTO getCustomisedGreeting(@PathVariable("name") final String name) {
    var dto = new GreetingDTO();
    dto.setGreeting("Hello" + name);

    return dto;
  }
}

package gov.uk.dwp.roadshow.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.dwp.roadshow.generated.rest.GreetingsApi;
import uk.gov.dwp.roadshow.generated.rest.model.GreetingDTO;

@RestController
public class GreetingApiAdapter implements GreetingsApi {

  @Override
  public ResponseEntity<GreetingDTO> getGreeting() {
    var dto = new GreetingDTO();
    dto.setGreeting("Hello caller");

    return ResponseEntity.ok(dto);
  }

  @Override
  public ResponseEntity<GreetingDTO> getCustomisedGreeting(String name) {
    var dto = new GreetingDTO();
    dto.setGreeting("Hello " + name);

    return ResponseEntity.ok(dto);
  }
}

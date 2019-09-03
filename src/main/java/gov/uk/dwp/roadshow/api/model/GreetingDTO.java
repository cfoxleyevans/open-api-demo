package gov.uk.dwp.roadshow.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GreetingDTO {

  private String greeting;
}

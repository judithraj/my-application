package uk.co.ii.service.document.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Mono;
import uk.co.ii.service.document.controller.viewmodel.DocumentViewModel;

public class DocumentController {

  @GetMapping(value = "/documents/summary", produces = MediaType.APPLICATION_JSON_VALUE)
  @Operation(operationId = "getDocument_v1", summary = "search customer contract notes documents",
      description = "Search and return documents x")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Customer documents")})
  public Mono<DocumentViewModel> getDocument(@RequestParam(required = false) BigDecimal quantityFrom, @RequestParam(required = false) BigDecimal quantityTo,
      @RequestParam(required = false) @Min(1) Integer pageNumber) {

    return Mono.just(new DocumentViewModel(quantityFrom, quantityTo, pageNumber));
  }
}

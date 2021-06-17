package uk.co.ii.service.document.controller;

import java.math.BigDecimal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uk.co.ii.service.document.controller.viewmodel.DocumentViewModel;

@RestController
@RequestMapping("/api")
public class DocumentController {

  @GetMapping
  public ResponseEntity<DocumentViewModel> getDocument(@RequestParam(required = false) BigDecimal quantityFrom, @RequestParam(required = false) BigDecimal quantityTo,
      @RequestParam(required = false) Integer pageNumber) {

    return ResponseEntity.ok(new DocumentViewModel(quantityFrom, quantityTo, pageNumber));
  }
}

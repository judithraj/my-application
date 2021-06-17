package uk.co.ii.service.document.controller.viewmodel;

import java.math.BigDecimal;
import lombok.Value;

@Value
public class DocumentViewModel {

  BigDecimal quantityFrom;
  BigDecimal quantityTo;
  Integer pageNumber;

}


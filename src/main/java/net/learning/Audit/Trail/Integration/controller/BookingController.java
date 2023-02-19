package net.learning.Audit.Trail.Integration.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.learning.Audit.Trail.Integration.model.Booking;
import net.learning.Audit.Trail.Integration.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * Controller Layer to test the Audit Trail Library <br>
 * . <br>
 * Note : This will not be the part of the Audit Trail Library
 */
@RestController
@RequestMapping("/komal")
@Slf4j
@RequiredArgsConstructor
public class BookingController {

  private final BookingService bookingService;

  /**
   * GET Endpoint to retrieve the Booking Details from DB.
   *
   * @return Booking Response
   */
  @GetMapping("/{id}")
  //@ResponseStatus(HttpStatus.OK)
  public Mono<Booking> sendShipmentNote(@PathVariable("id") String bookingId) {
    log.info("Received request for getBooking");
    return bookingService.sendShipmentNote(bookingId);
  }
}

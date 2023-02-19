package net.learning.Audit.Trail.Integration.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.learning.Audit.Trail.Integration.model.Booking;
import net.learning.Audit.Trail.Integration.config.BookingShipmentNoteEventDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Service class for domain layer <br>
 * . . <br>
 * Note : This will not be the part of the Audit Trail Library
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class BookingService {

  private final BookingShipmentNoteEventDispatcher bookingShipmentNoteEventDispatcher;

  /**
   * Build and Publishes the ShipmentNote.
   *
   * @param bookingId a unique ID
   * @return mono of ShipmentNotes
   */
  public Mono<Booking> sendShipmentNote(String bookingId) {
    return Mono.just(Booking.builder().booingNumber(bookingId).bookingStatus("CONFIRM").build())
        .flatMap(bookingShipmentNoteEventDispatcher::publishShipmentNote);
  }
}

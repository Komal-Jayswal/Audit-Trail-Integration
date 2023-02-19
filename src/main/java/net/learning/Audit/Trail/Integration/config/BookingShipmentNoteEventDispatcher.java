package net.learning.Audit.Trail.Integration.config;

import net.apmoller.crb.telikos.libraries.audit.client.dispatcher.ShipmentNoteEventDispatcher;
import net.apmoller.crb.telikos.libraries.audit.client.model.shipment.AuditData;
import net.apmoller.crb.telikos.libraries.audit.client.model.shipment.ShipmentNote;
import net.apmoller.crb.telikos.libraries.audit.client.model.shipment.ShipmentNotes;
import net.apmoller.crb.telikos.libraries.audit.client.utils.HelperUtils;
import net.learning.Audit.Trail.Integration.model.Booking;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Services will create their classes and extend the ShipmentNoteEventDispatcher abstract class. to
 * publish the Shipment Note Events.
 */
@Component
public class BookingShipmentNoteEventDispatcher
    extends ShipmentNoteEventDispatcher<Booking, ShipmentNotes> {

  /**
   * Method will be used to Build the predefined Contract Of ShipmentNote.
   *
   * @param booking the generic function argument contains the fields to be mapped
   * @return Contract Of Shipment Note
   */
  @Override
  public ShipmentNotes map(Booking booking) {
    return ShipmentNotes.builder()
        .bookingNumber(booking.getBooingNumber())
        .orderId("IOM12345")
        .auditDataList(
            List.of(
                AuditData.builder()
                    .changedProperty("PickUp Location")
                    .previousValue("Chennai")
                    .newValue("Bangalore")
                    .build()))
        .eventTimestamp(HelperUtils.currentTimeStamp())
        .productType("Intermodal")
        .eventName("Booking Creation")
        .userId("ABC123")
        .modifiedBy("agentName/systemName")
        .metadata("jsonData")
        .shipmentNoteList(
            List.of(ShipmentNote.builder()
                .eventType("auto/manual")
                .workOrderNumber("")
                .source("agent")
                .category("Booking Creation")
                .timestamp("22/01/23")
                .comments("BookingId:IOM12345 User:ABCD(ABC123) Date: 22/01/23 14:23")
                .build()))
        .build();
  }
}

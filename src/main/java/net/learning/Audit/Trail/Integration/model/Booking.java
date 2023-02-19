package net.learning.Audit.Trail.Integration.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Booking dummy Model <br>
 * . <br>
 * Note : This will not be the part of the Audit Trail Library
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
  private String booingNumber;
  private String bookingStatus;
}

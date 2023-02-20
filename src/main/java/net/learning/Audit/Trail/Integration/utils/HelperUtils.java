package net.learning.Audit.Trail.Integration.utils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/** Audit Client helper Util Class. */
public class HelperUtils {

  /**
   * Method to return the current TimeStamp.
   *
   * @return the current time stamp
   */
  public static String currentTimeStamp() {
    return DateTimeFormatter.ofPattern(Constants.TIME_STAMP_FORMAT)
        .format(LocalDateTime.now(ZoneOffset.UTC));
  }
}

package com.gridnine.testing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * A class for filtering the list of flights
 */
public class FlightFilterImpl implements FlightFilter{

    private final List<Segment> segs = new ArrayList<>();
    private final LocalDateTime currentDateTime = LocalDateTime.now();
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private final List <Flight> tempListFlights = new ArrayList<>();

    @Override
    public void allFlightSegments(List<Flight> flights) {

    }

    @Override
    public List<Flight> departureToTheCurrentPointInTime(List<Flight> flights) {
        return null;
    }

    @Override
    public List<Flight> thereAreSegmentsWithTheArrivalDateEarlierThanTheDepartureDate(List<Flight> flights) {
        return null;
    }

    @Override
    public List<Flight> theTotalTimeSpentOnTheGroundExceedsTwoHours(List<Flight> flights) {
        return null;
    }

    private void showFlight (Flight flight, LocalDateTime dep, LocalDateTime arr){
        System.out.println("departure: " + dateTimeFormatter.format(dep)+ "\n"
                + "arrival: " + dateTimeFormatter.format(arr) + "\n");
    }
}

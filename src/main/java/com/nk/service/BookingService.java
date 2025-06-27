package com.nk.service;

import com.nk.request.Passenger;
import com.nk.response.Ticket;

public interface BookingService {

    public Ticket bookTicket(Passenger passenger);

    public Ticket getTicket(Integer ticketNumber);

}

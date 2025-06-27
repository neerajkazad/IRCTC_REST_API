package com.nk.controller;

import com.nk.request.Passenger;
import com.nk.response.Ticket;
import com.nk.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingRestController {

    @Autowired
    private BookingService bookingService;

    @PostMapping(
            value="/ticket",
            consumes = {"application/json"},
            produces = {"application/json"}
    )
    public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger passenger){

        System.out.println(passenger);
        Ticket ticket = bookingService.bookTicket(passenger);
        return new ResponseEntity<>(ticket, HttpStatus.CREATED);
    }

    @GetMapping(
            value = "/ticket/{ticketNumber}",
            produces = "application/json"
    )
    public Ticket getTicketByNumber(@PathVariable Integer ticketNumber){
        return bookingService.getTicket(ticketNumber);
    }
}



package com.nk.service.impl;

import com.nk.request.Passenger;
import com.nk.response.Ticket;
import com.nk.service.BookingService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookingServiceImpl implements BookingService {

    private Map<Integer, Ticket> ticketsMap = new HashMap<>();
    private Integer ticketNumber = 1;

    @Override
    public Ticket bookTicket(Passenger passenger) {

        //logic

        Ticket ticket = new Ticket();
        BeanUtils.copyProperties(passenger, ticket);
        ticket.setTicketCost(550.00);
        ticket.setStatus("CONFIRMED");
        ticket.setTicketNumber(ticketNumber);

        ticketsMap.put(ticketNumber, ticket);
        ticketNumber++;
        return ticket;
    }

    @Override
    public Ticket getTicket(Integer ticketNumber) {

        if(ticketsMap.containsKey(ticketNumber)){
            return ticketsMap.get(ticketNumber);
        }
        return null;
    }
}

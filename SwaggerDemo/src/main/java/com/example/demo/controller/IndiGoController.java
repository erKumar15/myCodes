package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.request.PassangerInfo;
import com.example.demo.response.TicketInfo;

@RestController
public class IndiGoController {

	@PostMapping(value="/bookFlightTicket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassangerInfo info){
		TicketInfo ticket=new TicketInfo();
		
		//logic to book ticket
		
		ticket.setName(info.getFname()+" "+info.getLname());
		ticket.setFrom(info.getFrom());
		ticket.setTo(info.getTo());
		ticket.setFlightId(info.getFlightId());
		ticket.setJourneyDate(info.getJourneyDate());
		ticket.setTicketStatus("Confirmed");
		ticket.setTicketPrice("5500");
		
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping("/getdata")
	public String getData() {
		return "welcome to ginger think exam";
	}
	
}

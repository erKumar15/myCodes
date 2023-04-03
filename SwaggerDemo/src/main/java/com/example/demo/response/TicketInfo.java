package com.example.demo.response;

public class TicketInfo {

	private String name;
	private String to;
	private String from;
	private String flightId;
	private String journeyDate;
	private String ticketPrice;
	private String ticketStatus;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
	@Override
	public String toString() {
		return "TicketInfo [name=" + name + ", to=" + to + ", from=" + from + ", flightId=" + flightId
				+ ", journeyDate=" + journeyDate + ", ticketPrice=" + ticketPrice + ", ticketStatus=" + ticketStatus
				+ "]";
	}
}

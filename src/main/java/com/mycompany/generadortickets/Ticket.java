/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generadortickets;

/**
 *
 * @author WORKING
 */
public class Ticket {
   private static int nextTicketNumber = 1;
    private int ticketNumber;

    public Ticket() {
        this.ticketNumber = nextTicketNumber;
        nextTicketNumber++;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public String toString() {
        return "Ticket #" + ticketNumber;
    }
}
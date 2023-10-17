/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generadortickets;

/**
 *
 * @author WORKING
 */
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class SistemaDeTickets {
    private Queue<Ticket> colaTickets;
    private Queue<Ticket> registroAtencion;  // Nuevo: Registro de tickets atendidos

    public SistemaDeTickets() {
        this.colaTickets = new LinkedList<>();
        this.registroAtencion = new LinkedList<>();
    }

    public void emitirTicket() {
        Ticket nuevoTicket = new Ticket();
        colaTickets.offer(nuevoTicket);
        JOptionPane.showMessageDialog(null, "Se emitió " + nuevoTicket + ". Tiempo estimado de espera: " + calcularTiempoEspera());
       
    }

    public void atenderTicket() {
        if (!colaTickets.isEmpty()) {
            Ticket ticketActual = colaTickets.poll();
            JOptionPane.showMessageDialog(null, "Se está atendiendo " + ticketActual);
            registroAtencion.offer(ticketActual);  // Nuevo: Agrega el ticket al registro
        } else {
            JOptionPane.showMessageDialog(null,"No hay más tickets para atender." );
           
        }
    }

    public void mostrarCola() {
        JOptionPane.showMessageDialog(null, "Cola de Tickets: " + colaTickets);
       
    }

    // Nuevo: Calcular tiempo estimado de espera
    private int calcularTiempoEspera() {
        return colaTickets.size() * 5;  // Simulación de tiempo estimado
    }

    // Nuevo: Mostrar registro de atención
    public void mostrarRegistroAtencion() {
        JOptionPane.showMessageDialog(null,"Registro de Atención: " + registroAtencion );
       
    }
}

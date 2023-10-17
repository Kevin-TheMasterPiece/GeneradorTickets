/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generadortickets;

import javax.swing.JOptionPane;



/**
 *
 * @author WORKING
 */
public class GeneradorTickets {

    public static void main(String[] args) {
     SistemaDeTickets sistema = new SistemaDeTickets();
     int op = 0;
     while (op != 5){
         op=Integer.parseInt(JOptionPane.showInputDialog(null, "- - - - - Sistema De Tickets - - - - - \n1. Emitir ticket \n2. Mostrar cola \n3. Atender ticket \n4. Registro de atención \n5. Salir"));
     switch (op){
         case 1: 
            sistema.emitirTicket();
            break;
         case 2:
             sistema.mostrarCola();
             break;
         case 3: 
              sistema.atenderTicket();
              break;
         case 4: 
             sistema.mostrarRegistroAtencion();
             break;
         case 5: 
             JOptionPane.showMessageDialog(null, "HASTA LA PROXIMA...");
             break;
         default:
             JOptionPane.showMessageDialog(null, "Seleccione una opcion correcta");
             break;
             
     }
     }
        
    }
}
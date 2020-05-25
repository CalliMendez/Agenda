/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author akbal
 */
public class evento {
    String Nombre,Fecha,Hora,lugar,organizador,telefono,correo;
    public evento(String Nombre,String Fecha,String Hora,String lugar,
            String organizador,String telefono,String correo){
    this.Nombre=Nombre;
    this.Fecha=Fecha;
    this.Hora=Hora;
    this.lugar=lugar;
    this.organizador=organizador;
    this.telefono=telefono;
    this.correo=correo;
    }

    evento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
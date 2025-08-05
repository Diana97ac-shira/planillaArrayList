/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Mechu
 */
public class Puestos {
    
    
    //Atributos
    
    private int idPuesto;
    private String nombrePuesto;
    private double salarios;

    
    
    
    public Puestos(int idPuesto, String nombrePuesto, double salarios) {
        this.idPuesto = idPuesto;
        this.nombrePuesto = nombrePuesto;
        this.salarios = salarios;
    }
    
    
    
     public Puestos() {
        this.idPuesto = 0;
        this.nombrePuesto = "";
        this.salarios = 0;
    }
    
     
    
    
    
    
    
    
    
}

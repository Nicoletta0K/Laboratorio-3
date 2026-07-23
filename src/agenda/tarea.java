/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

/**
 *
 * @author Stef
 */
public class tarea {
    private String descripcion;
    private String estado;

    public String getDescripcion() {
        return descripcion;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public tarea(String descripcion, String estado) {
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return descripcion + " - " + estado;
    }
    
}

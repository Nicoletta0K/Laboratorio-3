/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

/**
 *
 * @author Stef
 */
public class controladorTarea { 
    private tarea[] tareas;
    public controladorTarea(){
        tareas= new tarea[30];
    }
    
    public int obtenerCantidadTareas(){
        int cont = 0;
        for(int i=0; i<30; i++){
            if(tareas[i]!=null){
            cont++;
        }
       }
      return cont;
    }
    public void agregarTarea(String descripcion) {
        int cantidad = obtenerCantidadTareas();
        if (cantidad < 30) {
            tareas[cantidad] = new tarea( descripcion,"Pendiente");
        }
    }

    public tarea obtenerTarea(int posicion) {
        return tareas[posicion];
    }
    public void completarTarea(int posicion) {
        if (tareas[posicion] != null) {
            tareas[posicion].setEstado( "Completada");
        }
    }
    public void eliminarTarea(int posicion) {
        if (tareas[posicion] != null) {
            for(int i = posicion; i < 29; i++) {
                tareas[i] = tareas[i + 1];
            }
            tareas[29] = null;
        }
    }

    
}

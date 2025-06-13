/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiptapparejas;

/**
 *
 * @author hnleo
 */
public class Usuarios {
   private String nombre;
   private String password;
   
   public Usuarios(String nombre, String contra){
       this.nombre = nombre;
       this.password = contra;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}

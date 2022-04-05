/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class accesoi {
  String pk_acceso;
    String usuario;
    String contraseña;

    public accesoi(String pk_acceso, String usuario, String clave) {
        this.pk_acceso = pk_acceso;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getPk_acceso() {
        return pk_acceso;
    }

    public void setPk_acceso(String pk_acceso) {
        this.pk_acceso = pk_acceso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return contraseña;
    }

    public void setClave(String clave) {
        this.contraseña = clave;
    }
    
    
    
            
}  


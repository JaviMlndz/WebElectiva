package modelo.pojos;
// Generated 12-11-2018 10:46:30 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Enfermeras generated by hbm2java
 */
public class Enfermeras  implements java.io.Serializable {


     private String duiEnfermera;
     private String nombre;
     private String clave;
     private String correo;
     private Set recetases = new HashSet(0);

    public Enfermeras() {
    }

	
    public Enfermeras(String duiEnfermera, String nombre, String clave, String correo) {
        this.duiEnfermera = duiEnfermera;
        this.nombre = nombre;
        this.clave = clave;
        this.correo = correo;
    }
    public Enfermeras(String duiEnfermera, String nombre, String clave, String correo, Set recetases) {
       this.duiEnfermera = duiEnfermera;
       this.nombre = nombre;
       this.clave = clave;
       this.correo = correo;
       this.recetases = recetases;
    }
   
    public String getDuiEnfermera() {
        return this.duiEnfermera;
    }
    
    public void setDuiEnfermera(String duiEnfermera) {
        this.duiEnfermera = duiEnfermera;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Set getRecetases() {
        return this.recetases;
    }
    
    public void setRecetases(Set recetases) {
        this.recetases = recetases;
    }




}


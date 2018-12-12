package modelo.pojos;
// Generated 12-11-2018 10:46:30 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Medicos generated by hbm2java
 */
public class Medicos  implements java.io.Serializable {


     private String duiMedico;
     private String nombre;
     private String clave;
     private String correo;
     private Set consultas = new HashSet(0);

    public Medicos() {
    }

	
    public Medicos(String duiMedico, String nombre, String clave, String correo) {
        this.duiMedico = duiMedico;
        this.nombre = nombre;
        this.clave = clave;
        this.correo = correo;
    }
    public Medicos(String duiMedico, String nombre, String clave, String correo, Set consultas) {
       this.duiMedico = duiMedico;
       this.nombre = nombre;
       this.clave = clave;
       this.correo = correo;
       this.consultas = consultas;
    }
   
    public String getDuiMedico() {
        return this.duiMedico;
    }
    
    public void setDuiMedico(String duiMedico) {
        this.duiMedico = duiMedico;
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
    public Set getConsultas() {
        return this.consultas;
    }
    
    public void setConsultas(Set consultas) {
        this.consultas = consultas;
    }




}


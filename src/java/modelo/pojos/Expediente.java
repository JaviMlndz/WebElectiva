package modelo.pojos;
// Generated 12-11-2018 10:46:30 PM by Hibernate Tools 4.3.1



/**
 * Expediente generated by hbm2java
 */
public class Expediente  implements java.io.Serializable {


     private Integer idExpediente;
     private String nombres;
     private String apellidos;
     private String domicilio;
     private String correo;
     private String telefono;
     private String genero;
     private String fechaNacimiento;
     private String lugarNacimiento;
     private int edad;
     private String ocupacion;
     private String observaciones;
     private String alergias;
     private String duiPaciente;

    public Expediente() {
    }

	
    public Expediente(String nombres, String apellidos, String domicilio, String correo, String telefono, String genero, String fechaNacimiento, String lugarNacimiento, int edad, String ocupacion, String observaciones, String duiPaciente) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.observaciones = observaciones;
        this.duiPaciente = duiPaciente;
    }
    public Expediente(String nombres, String apellidos, String domicilio, String correo, String telefono, String genero, String fechaNacimiento, String lugarNacimiento, int edad, String ocupacion, String observaciones, String alergias, String duiPaciente) {
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.domicilio = domicilio;
       this.correo = correo;
       this.telefono = telefono;
       this.genero = genero;
       this.fechaNacimiento = fechaNacimiento;
       this.lugarNacimiento = lugarNacimiento;
       this.edad = edad;
       this.ocupacion = ocupacion;
       this.observaciones = observaciones;
       this.alergias = alergias;
       this.duiPaciente = duiPaciente;
    }
   
    public Integer getIdExpediente() {
        return this.idExpediente;
    }
    
    public void setIdExpediente(Integer idExpediente) {
        this.idExpediente = idExpediente;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getLugarNacimiento() {
        return this.lugarNacimiento;
    }
    
    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getOcupacion() {
        return this.ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getAlergias() {
        return this.alergias;
    }
    
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    public String getDuiPaciente() {
        return this.duiPaciente;
    }
    
    public void setDuiPaciente(String duiPaciente) {
        this.duiPaciente = duiPaciente;
    }




}



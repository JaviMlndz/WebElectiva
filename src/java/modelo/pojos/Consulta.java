package modelo.pojos;
// Generated 12-11-2018 10:46:30 PM by Hibernate Tools 4.3.1



/**
 * Consulta generated by hbm2java
 */
public class Consulta  implements java.io.Serializable {


     private Integer idConsulta;
     private Medicos medicos;
     private Paciente paciente;
     private String razonConsulta;
     private String sintomas;
     private String fecha;
     private String hora;
     private int estadoConsulta;

    public Consulta() {
    }

    public Consulta(Medicos medicos, Paciente paciente, String razonConsulta, String sintomas, String fecha, String hora, int estadoConsulta) {
        this.medicos = medicos;
        this.paciente = paciente;
        this.razonConsulta = razonConsulta;
        this.sintomas = sintomas;
        this.fecha = fecha;
        this.hora = hora;
        this.estadoConsulta = estadoConsulta;
    }

    public Consulta(Object medicos, Object paciente, String razonConsulta, String sintomas, String fecha, String hora, String estadoConsulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  
    public Integer getIdConsulta() {
        return this.idConsulta;
    }
    
    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }
    public Medicos getMedicos() {
        return this.medicos;
    }
    
    public void setMedicos(Medicos medicos) {
        this.medicos = medicos;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getRazonConsulta() {
        return this.razonConsulta;
    }
    
    public void setRazonConsulta(String razonConsulta) {
        this.razonConsulta = razonConsulta;
    }
    public String getSintomas() {
        return this.sintomas;
    }
    
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return this.hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    public int getEstadoConsulta() {
        return this.estadoConsulta;
    }
    
    public void setEstadoConsulta(int estadoConsulta) {
        this.estadoConsulta = estadoConsulta;
    }




}



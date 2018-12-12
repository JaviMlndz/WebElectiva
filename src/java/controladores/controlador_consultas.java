/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.ConsultasDAO;
import modelo.pojos.Consulta;

/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class controlador_consultas implements Serializable {
     private List<Consulta> listar_consultas;
    private Consulta consulta;

    public controlador_consultas(Consulta consulta) {
        consulta = new Consulta();
    }
    
    
    public List<Consulta> getListaConsulta() {
        ConsultasDAO cd = new ConsultasDAO();
        listar_consultas = cd.listar_consultas();
        return listar_consultas;
    }

    public void setListaConsulta(List<Consulta> listaPagos) {
        this.listar_consultas = listaPagos;
    }
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
 

    public void agregarConsulta() {
        ConsultasDAO co = new ConsultasDAO();
        co.agregar_consulta(consulta);
    }

    public void modificarConsulta() {
      ConsultasDAO co = new ConsultasDAO();
        co.modificar_consulta(consulta);
    }

    public void eliminarConsulta() {
         ConsultasDAO co = new ConsultasDAO();
        co.modificar_consulta(consulta);
    
    
}}

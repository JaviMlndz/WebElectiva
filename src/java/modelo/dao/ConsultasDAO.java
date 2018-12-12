/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;
import modelo.pojos.Consulta;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import java.util.List;

/**
 *
 * @author PC-TEC
 */
public class ConsultasDAO {
    
    
    /*public void IngresarConsulta(Consulta c){
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction trandaction=null;
    try{
    sessionFactory =HibernateUtil.getSessionFactory();
    session=sessionFactory.openSession();
    trandaction=session.beginTransaction();
    session.save(c);
    trandaction.commit();
    session.close();
    
    }catch(Exception e){
        trandaction.rollback();
        throw new RuntimeException("Registro No Guardado!!!");
    
    }}*/
    
     
    
    
    /*public void ActualizarConsulta(Consulta c,String dui,String fecha,String hora){
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction trandaction=null;
    try{
    sessionFactory =HibernateUtil.getSessionFactory();
    session=sessionFactory.openSession();
    trandaction=session.beginTransaction();
    session.save(c);
    trandaction.commit();
    session.close();
    
    }catch(Exception e){
        trandaction.rollback();
        throw new RuntimeException("Registro No Guardado!!!");
    
    }
    }*/
      /*public String ConsultasPorPaciente(String dui_paciente){
           
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction trandaction=null;
    
    sessionFactory=HibernateUtil.getSessionFactory();
    session=sessionFactory.openSession();
    Consulta c =(Consulta)session.get(Consulta.class, dui_paciente);
    if(c!=null)
    {
      return "Paciente: "+c.getPaciente()+
              "Razon Consulta: "+c.getRazonConsulta()+
              "Sintomas: "+ c.getSintomas()+
              "Fecha Consulta: "+c.getFecha()+
              "Hora Consulta: "+c.getHora()+
              "Estado: "+c.getEstadoConsulta()+
              "Doctor: "+c.getMedicos();
      
    }else{
    
    return "Sin Resultados!!! No esta registrado el dui que ingreso";
    }
      
      
      
      }*/
      
    /*public List<Consulta> ConsultasTodosPaciente(){
           
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction trandaction=null;
    
    sessionFactory=HibernateUtil.getSessionFactory();
    session=sessionFactory.openSession();
    Query query=session.createQuery("from Consulta");
    List<Consulta> lista=query.list();
    session.close();  
    
    return lista;
    }
        public String ConsultasPorMedico(String dui_medico){
           
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction trandaction=null;
    
    sessionFactory=HibernateUtil.getSessionFactory();
    session=sessionFactory.openSession();
    Consulta c =(Consulta)session.get(Consulta.class, dui_medico);
session.close();
    if(c!=null)
    {
      return "Paciente: "+c.getPaciente()+
              "Razon Consulta: "+c.getRazonConsulta()+
              "Sintomas: "+ c.getSintomas()+
              "Fecha Consulta: "+c.getFecha()+
              "Hora Consulta: "+c.getHora();
      
    }else{
    
    return "Sin Resultados!!! No esta registrado el dui que ingreso";
    }
      
      
      
      }*/
       /*public String ConsultasPorEstado(int estado){
           
    SessionFactory sessionFactory=null;
    Session session=null;
    Transaction trandaction=null;
    
    sessionFactory=HibernateUtil.getSessionFactory();
    session=sessionFactory.openSession();
    Consulta c =(Consulta)session.get(Consulta.class, estado);
    session.close();
    if(c!=null)
    {
      return "Paciente: "+c.getPaciente()+
              "Razon Consulta: "+c.getRazonConsulta()+
              "Sintomas: "+ c.getSintomas()+
              "Fecha Consulta: "+c.getFecha()+
              "Hora Consulta: "+c.getHora();
      
    }else{
    
    return "Sin Resultados!!! No esta registrado el dui que ingreso";
    }
      
      }*/
        public List<Consulta> listar_consultas() {
        List<Consulta> lista = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sesion.beginTransaction();
        String hql = "FROM Consulta";
        try {
            lista = sesion.createQuery(hql).list();
            t.commit();
            sesion.close();
        } catch (Exception e) {
            t.rollback();
        }
        return lista;
    }
       
        public void agregar_consulta(Consulta consulta) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(consulta);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void modificar_consulta(Consulta consulta) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(consulta);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void eliminar_consulta(Consulta consulta) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(consulta);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }
   
}
     
   
      
      
    

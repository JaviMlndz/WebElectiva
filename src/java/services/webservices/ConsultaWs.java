/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Cristian
 */
@WebService(serviceName = "ConsultaWs")
public class ConsultaWs {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarconsulta")
    public String insertarconsulta(@WebParam(name = "razon") String razon, @WebParam(name = "sintomas") String sintomas, @WebParam(name = "fecha") String fecha, @WebParam(name = "hora") String hora, @WebParam(name = "estado") int estado, @WebParam(name = "dui_medico") String dui_medico, @WebParam(name = "dui_paciente") String dui_paciente) {
        //TODO write your implementation code here:
        return null;
    }
}

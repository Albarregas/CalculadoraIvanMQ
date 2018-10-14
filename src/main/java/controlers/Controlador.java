/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.*;

/**
 *
 * @author Iván
 */
@WebServlet(name = "controlador", urlPatterns = {"/ctrl"})
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String urlResultado=request.getContextPath()+"src/main/webapp/JSP/resultado.jsp";
            String urlError=request.getContextPath()+"src/main/webapp/JSP/errores.jsp";
            String clave="KEY";
            Calculator calculator = new Calculator();
            //request.getRequestDispatcher("path").forward(request, response); Te lleva a la ruta indicada
            calculator.setValor1(Integer.parseInt(request.getParameter("Valor1")));
            calculator.setValor2(Integer.parseInt(request.getParameter("Valor2")));
            

            if (request.getParameter("Enviar").equals("Sumar")) {
                Sumador suma = new Sumador();
                calculator.setResultado(suma.sumar(calculator.getValor1(), calculator.getValor2()));
                calculator.setSigno('+');
            } else if (request.getParameter("Enviar").equals("Restar")) {
                Restador resta = new Restador();
                calculator.setResultado(resta.restar(calculator.getValor1(), calculator.getValor2()));
                calculator.setSigno('-');
            } else if (request.getParameter("Enviar").equals("Multiplicar")) {
                Multiplicador multi = new Multiplicador();
                calculator.setResultado(multi.multiplicar(calculator.getValor1(), calculator.getValor2()));
                calculator.setSigno('*');
            } else if (request.getParameter("Enviar").equals("Dividir")) {
                if (calculator.getValor2()!=0){
                Divisor divis = new Divisor();
                calculator.setResultado(divis.dividir(calculator.getValor1(), calculator.getValor2()));
                calculator.setSigno('/');
                }else{
                    request.getRequestDispatcher(urlError).forward(request, response);
                }
            }
            request.getSession().setAttribute(clave,calculator.toString());
            request.getRequestDispatcher(urlResultado).forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

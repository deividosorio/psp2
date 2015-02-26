/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp2.vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Clase que representa la vista para el ambiente web que será visualizada en un
 * explorador
 * @author deividosorio
 * @version 25/02/2015
 */
public class MainView {
    
        public static void showHome(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter pw = resp.getWriter();
        pw.write("<html>");
        pw.println("<h1>PSP2 Programa de integración numéricamente de una función utilizando"
                + "la regla de Simpson</h1>");
        pw.println("<p>ECOS 2015 <br>Deivid Alexander Osorio Barrera</p>");
        pw.println("<p>Taller N.5</p>");
        
        pw.write("<p>Ingrese los valores de x y dof</p> \n");
        pw.write("<form action=\"calc\" method=\"post\"> \n"
                + "    X: 0 to <input type=\"text\" size=\"10\" name=\"valX\"><br>\n"
                + "    dof: <input type=\"text\" size=\"10\" name=\"valdof\"><br>\n"
                + "    <input type=\"submit\" value=\"Calcular Integral\"> </form> "
                + "<p>Se toma como valor constante num_seg = 10</p>"
                + "<p>Se toma como valor constante E = 0.00001</p>");
        pw.write("</html>");

    }

    public static void showResults(HttpServletRequest req, HttpServletResponse resp, 
            double valorP) throws IOException {   
        
        DecimalFormat formatter = new DecimalFormat("#0.0000");
        resp.getWriter().println("<br><hr>");
        resp.getWriter().println("<h2>Resultados</h2>");
        resp.getWriter().println("<b>Valor P:</b>   " + formatter.format(valorP) + "<br>");
        resp.getWriter().println("<hr>");
        resp.getWriter().println("<h2>Test Realizados</h2>");
        resp.getWriter().println("<b>Test1: <br></b>Valor X= 0 to 1.1 <br> Valor dof = 9 <br>"
                + "<b>Test2: <br></b>Valor X= 0 to 1.1812 <br> Valor dof = 10 <br>"
                + "<b>Test3: <br></b>Valor X= 0 to 2.750 <br> Valor dof = 30 <br>");
        
    }    
}

package edu.uniandes.ecos.psp2.controlador;

import edu.uniandes.ecos.psp2.modelo.Calculator;
import edu.uniandes.ecos.psp2.vista.MainView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/*/**
 * Clase que representa el controlador de la aplicación 
 * que comunica la interface con el mundo
 * @author deividosorio
 * @version 25/02/2015
 */
public class App extends HttpServlet {

    public static void main(String[] args) {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new App()), "/*");
        try {
            server.start();
            server.join();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        MainView.showHome(req, resp);
        MainView.showResults(req, resp, 0);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            MainView.showHome(req, resp);
            consoleInput(req, resp);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo que recibe información de las clases y retorna el valor de P
     *
     * @param req de Input
     * @param resp de inpunt
     * @throws IOException para validación de error de IO
     */
    public void consoleInput(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        double valX = Double.parseDouble(req.getParameter("valX"));
        double valdof = Double.parseDouble(req.getParameter("valdof"));

        Calculator calc = new Calculator(valX, valdof);
        double valP = calc.getP();   
        MainView.showResults(req, resp, valP);
    }
}

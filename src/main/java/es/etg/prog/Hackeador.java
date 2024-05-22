package es.etg.prog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hackear")
public class Hackeador extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
       PrintWriter printWriter = resp.getWriter();
       printWriter.write("Hola Mundo!!!");
       printWriter.close();
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
       PrintWriter out = resp.getWriter();

       out.println("<html>");
       out.println("<head></head>");         
       out.println("<body>");

       out.println("Usuario:");
       String usu=req.getParameter("usuario");
       out.println(usu);
       out.println("<br>");
       out.println("Clave:");         
       String cla=req.getParameter("clave");
       out.println(cla);
       
       out.println("</body>");
       out.println("</html>");   
   }
}
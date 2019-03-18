import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FwdDemo extends HttpServlet {
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          String username = request.getParameter("login");
          out.println("<h1>" + "Welcome " + username + "</h1>");
     }
}

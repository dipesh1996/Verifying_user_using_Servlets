import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CallServlet extends HttpServlet {
     public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          RequestDispatcher rd;
          String login = request.getParameter("login");
          String pwd = request.getParameter("pwd");
          if (login.equals("dipesh") && pwd.equals("123456")) {
               rd = request.getRequestDispatcher("FwdDemo");
               rd.forward(request, response);
          }
          else {
               out.println("<p><h1>Incorrect Login Id/Password</h1></p>");
               rd = request.getRequestDispatcher("/main.html");
               rd.include(request, response);
          } 
     } 
}

package am.ibm;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int number1 = Integer.parseInt(request.getParameter("num1"));
        int number2 = Integer.parseInt(request.getParameter("num2"));

        int sum = number1+number2;

        //PrintWriter output = response.getWriter();
        //response.getWriter().println("Sum is " + sum);

        Cookie  cookie = new Cookie("sum", (sum+""));
        response.addCookie(cookie);

        response.sendRedirect("square"); // URL redirect

       //RequestDispatcher requestDispatcher = request.getRequestDispatcher("/square");
        //requestDispatcher.forward(request, response);

    }

}

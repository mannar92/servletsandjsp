package am.ibm;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int number1 = Integer.parseInt(request.getParameter("num1"));
        int number2 = Integer.parseInt(request.getParameter("num2"));

        int sum = number1+number2;

        //System.out.println("Sum of number1: "+number1+" and number2: "+number2+" is " + sum);

        //PrintWriter output = response.getWriter();
        //response.getWriter().println("Sum is " + sum);

        request.setAttribute("key", sum);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/square");
        requestDispatcher.forward(request, response);

    }

}

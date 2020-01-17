package am.ibm;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //System.out.println("Sum of number1: "+number1+" and number2: "+number2+" is " + sum);
        //int sum = Integer.parseInt(request.getParameter("sum"));
        int sum = 0;
        Cookie[] cookies = request.getCookies();

        for (Cookie c : cookies){
            if (c.getName()=="sum") {
                sum = Integer.parseInt(c.getValue());
            }
        }

        int squaredValue = sum*sum;

        PrintWriter output = response.getWriter();
        output.println("Squared Value of Sum is " + squaredValue);
    }

}

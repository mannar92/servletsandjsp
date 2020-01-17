package am.ibm;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //System.out.println("Sum of number1: "+number1+" and number2: "+number2+" is " + sum);
        int sum = (Integer) request.getAttribute("key");
        int squaredValue = sum*sum;

        PrintWriter output = response.getWriter();
        output.println("Squared Value of Sum is " + squaredValue);
        output.print("This is a test commit!");
    }

}

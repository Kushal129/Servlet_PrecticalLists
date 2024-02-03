

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		 PrintWriter out = response.getWriter();
	        out.println("<html><head><title>Calculator Result</title></head><body>");

	        try {
	            double num1 = Double.parseDouble(request.getParameter("num1"));
	            double num2 = Double.parseDouble(request.getParameter("num2"));
	            String operation = request.getParameter("operation");

	            double result = 0;

	            switch (operation) {
	                case "add":
	                    result = num1 + num2;
	                    break;
	                case "subtract":
	                    result = num1 - num2;
	                    break;
	                case "multiply":
	                    result = num1 * num2;
	                    break;
	                case "divide":
	                    result = num1 / num2;
	                    break;
	                default:
	                    throw new IllegalArgumentException("Invalid operation");
	            }

	            out.println("<h2>Calculation Result:</h2>");
	            out.println("<p>" + num1 + " " + operation + " " + num2 + " = " + result + "</p>");

	        } catch (Exception e) {
	            out.println("<p>Error: " + e.getMessage() + "</p>");
	        }

	        out.println("</body></html>");
	    }

}

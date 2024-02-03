

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  PrintWriter out = response.getWriter();
	        out.println("<html><head><title>Registration Details</title></head><body>");

	        out.println("<h2>Registration Details:</h2>");
	        out.println("<p>First Name: " + request.getParameter("firstName") + "</p>");
	        out.println("<p>Last Name: " + request.getParameter("lastName") + "</p>");
	        out.println("<p>Email: " + request.getParameter("email") + "</p>");
	        out.println("<p>Phone: " + request.getParameter("phone") + "</p>");
	        out.println("<p>Gender: " + request.getParameter("gender") + "</p>");
	        out.println("<p>Qualification: " + request.getParameter("qualification") + "</p>");
	        out.println("<p>Experience: " + request.getParameter("experience") + " years</p>");
	        out.println("<p>Skills: " + request.getParameter("skills") + "</p>");
	        out.println("<p>Resume: " + request.getParameter("resume") + "</p>");
	        
	        String tcd = request.getParameter("tcd");
	        if (tcd != null && tcd.equals("yes")) {
	            out.println("<p>Terms and conditions apply: Yes</p>");
	        } else {
	            out.println("<p>Terms and conditions apply: No</p>");
	        }
	        

	        out.println("</body></html>");
	        
	}

}

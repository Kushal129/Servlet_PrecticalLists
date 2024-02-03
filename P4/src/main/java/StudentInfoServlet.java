

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class StudentInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws IOException {
//		step1: pela html ma karvanu
		response.setContentType("text/html");
		
		//show in html 
		PrintWriter out = response.getWriter();
        out.println("<html><head><title>Student Information</title></head><body>");
        
//        obj kari ne store katrvav 
        
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String course = request.getParameter("course");
        
//        output
        out.println("<h2>Student Information:</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Roll Number: " + roll + "</p>");
        out.println("<p>Course: " + course + "</p>");

        out.println("</body></html>");
        
        
	}

}

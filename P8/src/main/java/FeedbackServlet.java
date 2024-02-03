

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        out.println("<html><head><title>Feedback Details</title></head><body>");

	        out.println("<h2>Feedback Details:</h2>");
	        out.println("<p>Enrollment Number: " + request.getParameter("enrollmentNumber") + "</p>");
	        out.println("<p>Full Name: " + request.getParameter("fullName") + "</p>");
	        out.println("<p>Semester: " + request.getParameter("semester") + "</p>");
	        out.println("<p>Division: " + request.getParameter("division") + "</p>");
	        out.println("<p>Subject Name: " + request.getParameter("subjectName") + "</p>");
	        out.println("<p>Faculty Name: " + request.getParameter("facultyName") + "</p>");
	        out.println("<p>Feedback Description: " + request.getParameter("feedbackDescription") + "</p>");

	        out.println("</body></html>");
	}

}

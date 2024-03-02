

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
		
		String enrollmentNumber = request.getParameter("enrollmentNumber");
        String fullName = request.getParameter("fullName");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String semester = request.getParameter("semester");
        String division = request.getParameter("division");
        String subjectName = request.getParameter("subjectName");
        String facultyName = request.getParameter("facultyName");
        String feedbackDescription = request.getParameter("feedbackDescription");

        // Perform server-side password validation
        if (!password.equals(confirmPassword)) {
            response.getWriter().println("Password and Confirm Password must be the same.");
            return;
        }


        // Display form details in the browser
        response.setContentType("text/html");
        response.getWriter().println("<h2>Student Feedback Details</h2>");
        response.getWriter().println("<p>Enrollment Number: " + enrollmentNumber + "</p>");
        response.getWriter().println("<p>Full Name: " + fullName + "</p>");
        response.getWriter().println("<p>Semester: " + semester + "</p>");
        response.getWriter().println("<p>Division: " + division + "</p>");
        response.getWriter().println("<p>Subject Name: " + subjectName + "</p>");
        response.getWriter().println("<p>Faculty Name: " + facultyName + "</p>");
        response.getWriter().println("<p>Feedback Description: " + feedbackDescription + "</p>");
    }
}

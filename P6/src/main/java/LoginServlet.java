

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Login Result</title></head><body>");
        
        String uname = request.getParameter("username");
        String upass = request.getParameter("password"); 
        
        String apeluser = "user1";
        String apelpass = "password1";
        
        if(uname.equals(apeluser) && upass.equals(apelpass)) {
        	out.println("<h2>Hello</h2>");
        }else {
        	 out.println("<p>Please provide valid username or password</p>");
        }
		out.println("</body></html>");
	}

}

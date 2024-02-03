

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LifeCycleDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public LifeCycleDemoServlet() {
		System.out.println("Servlet Constructor Called");
	}
	public void init() throws ServletException{
		System.err.println("Servlet Initialization");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet Handl GET Request");
		response.getWriter().append("Servlet Life Cycle Demo ");
	}
	public void destroy() {
		System.out.println("Servlet Destroy !");
	}
}

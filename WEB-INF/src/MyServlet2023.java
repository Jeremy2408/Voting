import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2023 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException{
		
		String name = request.getParameter("name");
		String emailAddress = request.getParameter("email");
		String top3Songs = request.getParameter("top3");

		

		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Name: "+name+"<br> </body></html>");
		out.println("<html><body>Email Address:"+emailAddress+"<br>  </body></html>");
		out.println("<html><body>Top 3 Songs : "+top3Songs+"<br>   </body></html>");
		
		
	}


}
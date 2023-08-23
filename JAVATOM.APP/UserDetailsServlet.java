import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserDetailsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");

        out.println("<html>");
        out.println("<head><title>User Details</title></head>");
        out.println("<body>");
        out.println("<h2>Hi " + name + ", you have entered:</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Mobile: " + mobile + "</p>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}


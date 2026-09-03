package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>GitOps Demo</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>GitOps Demo Application</h1>");

        if (name != null && !name.isBlank()) {
            out.println("<h2>Hello " + name + "!</h2>");
            out.println("<p>Application is working successfully.</p>");
        }

        out.println("<form action=\"hello\" method=\"get\">");
        out.println("<label>Enter your name:</label>");
        out.println("<input type=\"text\" name=\"name\" />");
        out.println("<button type=\"submit\">Submit</button>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }
}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Blindlogoutserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    String msg="";
    
    public Blindlogoutserv() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();

		hs.invalidate();
		request.setAttribute("msg","You have logged out Successfully!" );
		request.getRequestDispatcher("/Homepage.jsp").forward(request, response);;
		
	}

}

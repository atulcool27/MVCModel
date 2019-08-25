package controller;


import model.GetSetReady;
import datao.Databook;
import java.io.IOException;
import javax.servlet.http.HttpSession;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Blindloginserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	String msg="abc";
    
    public Blindloginserv() {
        super();
        
    }

   //Since in form i mentioned method=post That's why we are here using doPost to get those values.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String souluser=request.getParameter("username");
		String soulpass=request.getParameter("password");
		
	//Now we store these values in GETSETREADY class because it contains getter and setter for us .
		GetSetReady gsr=new GetSetReady();
		gsr.setName(souluser);
		gsr.setPass(soulpass);	
		
		Databook dab=new Databook();
		msg=dab.Loginbook(gsr);
		
		
		if(msg.equals("VERIFIED")) {
			HttpSession hs=request.getSession();
			hs.setMaxInactiveInterval(300);
			
			request.setAttribute("username", souluser);
			request.getRequestDispatcher("/Profilepage.jsp").forward(request, response);;
		}
		else {
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("Loginpage.jsp").forward(request, response);
		}
		
		
	}

}

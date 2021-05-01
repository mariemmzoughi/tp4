package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.authentificationB;

/**
 * Servlet implementation class authentificationS
 */
@WebServlet("/authentificationS")
public class authentificationS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public authentificationS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prenom = request.getParameter( "a" );
        String nom = request.getParameter( "b" );
        
		String message ;
		if (nom.trim().isEmpty()||prenom.trim().isEmpty()) {
			 message = "erreur donner votre nom et prenom";
		}
		else {
			message = "Bienvenue à votre session";
		}
		authentificationB auth = new authentificationB();
		 request.setAttribute("nom",nom);
	     request.setAttribute("prenom",prenom);
		HttpSession maSession = request.getSession();
		maSession.setAttribute("nompre", auth);
		request.setAttribute( "message", message );
		String address = "authentificationJ.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(address);
	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

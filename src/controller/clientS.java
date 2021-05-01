package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.clientB;

/**
 * Servlet implementation class clientS
 */
@WebServlet("/clientS")
public class clientS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter( "nomClient" );
        String prenom = request.getParameter( "prenomClient" );
        String adresse = request.getParameter( "adresseClient" );
        String telephone = request.getParameter( "telephoneClient" );
        String email = request.getParameter( "emailClient" );

        String message;
        if ( nom.trim().isEmpty() || adresse.trim().isEmpty() || telephone.trim().isEmpty() ) {
            message = " Vous n'avez pas rempli tous les champs obligatoires. ";
        } else {
            message = "Client cr�� avec succ�s !";
        }
       
        clientB client = new clientB();
        request.setAttribute("nomClient",nom);
        request.setAttribute("prenomClient",prenom);
        request.setAttribute("adresseClient",adresse);
        request.setAttribute("telephoneClient",telephone);
        request.setAttribute("emailClient",email);
        HttpSession maSession = request.getSession(true);
		maSession.setAttribute("client", client);
        
        request.setAttribute( "message", message );

        
        String address = "clientJ.jsp";
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

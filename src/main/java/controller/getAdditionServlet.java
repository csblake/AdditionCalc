package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AdditionCalc;

/**
 * Servlet implementation class getAdditionServlet
 */
@WebServlet("/getAdditionServlet")
public class getAdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAdditionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get all three of the users numbers
		String userNum1 = request.getParameter("userNumber1");
		String userNum2 = request.getParameter("userNumber2");
		String userNum3 = request.getParameter("userNumber3");
		
		AdditionCalc addCalc = new AdditionCalc(Integer.parseInt(userNum1), Integer.parseInt(userNum2), Integer.parseInt(userNum3));
		
		request.setAttribute("userTotal", addCalc);
		
		getServletContext().getRequestDispatcher("/total.jsp").forward(request, response);
	}

}

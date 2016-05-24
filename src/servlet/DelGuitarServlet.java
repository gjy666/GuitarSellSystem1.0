package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guitar.util.DAO;
import guitar.util.DaoImple;

@WebServlet("/DelGuitarServlet")
public class DelGuitarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DelGuitarServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String serialNumber = request.getParameter("serialNumber");
		System.out.println(serialNumber);
		DAO dao = new DaoImple();
		dao.delGuitar(serialNumber);
		response.sendRedirect("htmls/GuitarList.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

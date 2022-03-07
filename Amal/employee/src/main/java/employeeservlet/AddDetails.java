package employeeservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employeeclass.Emp;
import employeeclass.EmpDAO;

/**
 * Servlet implementation class AddDetails
 */
@WebServlet("/add-details.html")
public class AddDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddDetails() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int doorNumber = Integer.parseInt(request.getParameter("doorNumber"));	
        String  streetName= request.getParameter("streetName");	
        String areaName = request.getParameter("areaName");	
        String city = request.getParameter("city");	
        String state = request.getParameter("state");	
        int pincode = Integer.parseInt(request.getParameter("pincode"));
        Emp employee = new Emp();
        employee.setDoor_number(doorNumber);
        employee.setStreet_name(streetName);
        employee.setArea_name(areaName);
        employee.setCity(city);
        employee.setState(state);
        employee.setPin(pincode);
        EmpDAO.addEmployee(employee);
        request.setAttribute("employee", employee);
        request.getRequestDispatcher("employeeregistration.jsp").forward(request, response);

        
	}

}

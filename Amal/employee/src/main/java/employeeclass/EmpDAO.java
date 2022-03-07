package employeeclass;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAO {
	public static final String url = "jdbc:sqlite:D:\\Employee\\emp.db";
        public static Emp addEmployee(Emp employee) {
		String query = "insert into employee2(door_number, street_name, area_name,"
				+ "city, state, pin) values(?, ?, ?, ?, ?, ?)";
		
 try {
	 Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection(url); 
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, employee.getDoor_number());
		st.setString(2, employee.getStreet_name());
		st.setString(3, employee.getArea_name());
		st.setString(4, employee.getCity());
		st.setString(5, employee.getState());
		st.setInt(6, employee.getPin());
		st.executeUpdate();
		conn.close();
 }
 catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return employee;
	
}

 
 
}

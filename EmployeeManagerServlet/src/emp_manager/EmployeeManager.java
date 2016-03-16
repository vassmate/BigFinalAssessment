package emp_manager;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeManager")
public class EmployeeManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ObjectInputStream input;
	private ObjectOutputStream output;
	private Socket connection;
	private PrintWriter writer;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		writer = response.getWriter();
		
		writer.println(
				"<html>"
				+ "<head>"
				+ "<title>Message</title>"
				+ "</head>"
				+ "<body>"
				+ "<h2 align='center'>Sending data to the server...</h2>"
				+ "<h2 align='center'>You set the following parameters:</h2>"
				+ "<h3 align='center'>Criteria:" + request.getParameter("criteria") + "</h3>"
				+ "<h3 align='center'>Mandatory:" + request.getParameter("mandatory") + "</h3>"
				+ "<h3 align='center'>Optional:" + request.getParameter("optional") + "</h3>"
				+ "</body>"
				+ "</html>"
				);
		
		try {
			connection = new Socket("192.168.1.67", 9134);
			output = new ObjectOutputStream(connection.getOutputStream());
			input = new ObjectInputStream(connection.getInputStream());
			output.writeObject("Sending data!");
			output.close();
			input.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

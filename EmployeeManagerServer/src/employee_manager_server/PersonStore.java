package employee_manager_server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import employee_manager_classes.DataReader;

public class PersonStore {

	private DataReader store;
	private ServerSocket server;
	private Socket connection;
	private ObjectInputStream input;
	private ObjectOutputStream output;

	public void start() {

		try {
			server = new ServerSocket(9134, 1);
			System.out.println("Waiting for connection...");

			connection = server.accept();
			System.out.println("Client connected from: " + connection.getRemoteSocketAddress());

			input = new ObjectInputStream(connection.getInputStream());
			output = new ObjectOutputStream(connection.getOutputStream());

			String inStr = (String) input.readObject();
			System.out.println("Client says: " + inStr);

			System.out.println("Closing connections...");
			output.close();
			input.close();
			connection.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

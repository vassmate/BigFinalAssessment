package employee_manager_server;

public class PersonStoreStart {
	public static void main(String[] args) {
		PersonStore server = new PersonStore();
		server.start();
	}
}

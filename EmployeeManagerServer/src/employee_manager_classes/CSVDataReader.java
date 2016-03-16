package employee_manager_classes;

import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader {

	private String csvFilePath;
	private List<Person> persons;

	public CSVDataReader(String filePath) {
		this.csvFilePath = filePath;
	}

	public Set<Person> getPersons() {

		return null;
	}
}

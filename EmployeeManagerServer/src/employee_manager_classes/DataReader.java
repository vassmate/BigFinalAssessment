package employee_manager_classes;

import java.util.Set;

public abstract class DataReader {

	private String searchCriteria;
	private SearchType searchType;

	public Set<Person> getPersons(String criteria, SearchType searchType) {
		return null;
	}

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}
}

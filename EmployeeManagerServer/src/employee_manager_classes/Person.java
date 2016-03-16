package employee_manager_classes;

import java.util.List;

public class Person {

	private String name;
	private String email;
	private List<Skill> skillset;

	Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Skill> getSkillset() {
		return skillset;
	}

	public void setSkillset(List<Skill> skillset) {
		this.skillset = skillset;
	}
}

package ar.edu.unlam.diit.scaw.services.impl;

import java.util.List;
import ar.edu.unlam.diit.scaw.daos.impl.PersonDaoImpl;
import ar.edu.unlam.diit.scaw.entities.Person;
import ar.edu.unlam.diit.scaw.services.PersonService;

public class PersonServiceImpl implements PersonService {

	PersonDaoImpl personHsql;
	
	public PersonServiceImpl(){
		personHsql = new PersonDaoImpl();
	}
	
	@Override
	public void save(Person person) {
		personHsql.save(person);
	}

	@Override
	public List<Person> findAll() {
		return personHsql.findAll();
	}

	public PersonDaoImpl getPersonHsql() {
		return personHsql;
	}

	public void setPersonHsql(PersonDaoImpl personHsql) {
		this.personHsql = personHsql;
	}
}

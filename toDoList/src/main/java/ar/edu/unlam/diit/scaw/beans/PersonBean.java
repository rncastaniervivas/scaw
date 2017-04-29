package ar.edu.unlam.diit.scaw.beans;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import ar.edu.unlam.diit.scaw.entities.Categoria;
import ar.edu.unlam.diit.scaw.entities.Person;
import ar.edu.unlam.diit.scaw.entities.Restriccion;
import ar.edu.unlam.diit.scaw.services.PersonService;
import ar.edu.unlam.diit.scaw.services.impl.PersonServiceImpl;

@ManagedBean(name = "personBean", eager = true)
@RequestScoped
public class PersonBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre = null;
	private String usuario = null;
	priva
	
	PersonService service;
	
	public PersonBean() {
		super();
		service = (PersonService) new PersonServiceImpl();
	}
	
	public String save() {
		
		Person person = buildPerson();
		
		service.save(person);
		
		return "welcome";
	}
	
	
	public List<Person> getFindAll() {
		List<Person> list = service.findAll();
		return list;
	}
	
	private Person buildPerson() {
		Person person = new Person();
		person.setNombre(this.nombre);
		person.setUsuario(this.usuario);
		person.setClave(this.clave);
		person.setEmail(this.email);
		person.setRestriccion(this.restriccion);
		person.setCategoria(this.categoria);
		
		return person;
	}

	public PersonBean(String nombre, String usuario, String clave, String email) {
		super();
		this.nombre = nombre;
		this.usuario = usuario;
		this.clave = clave;
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Restriccion getRestricion() {
		return restriccion;
	}

	public void setRestricion(Restriccion restricion) {
		this.restriccion = restricion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}

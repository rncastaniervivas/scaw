package ar.edu.unlam.diit.scaw.entities;

import java.io.Serializable;

public class Tarea implements Serializable {

private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String descripcion;
	private String fecha;
	private Modo modo;
	private Tipo tipo;
	private Estado estado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Modo getModo() {
		return modo;
	}
	public void setModo(Modo modo) {
		this.modo = modo;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}

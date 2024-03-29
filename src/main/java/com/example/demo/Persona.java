package com.example.demo;

import javax.persistence.*;

@Entity// Anotaciones de String
@Table(name = "personas")//Nombre de la tabla de la BD
public class Persona {
	
	//Atribbutos identicos de la tabla
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Genera el Id
    private Long id;
	@Column
	private String name;
	@Column
	private String ape;
	@Column
	private String cedula;
	@Column
	private String celular;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String toString() {
		return "Customer [id=" + this.id + ", name=" + this.name + ", ape=" + this.ape + ", cedula=" + this.cedula + ", celular=" + this.celular + "]";
	}
	

}

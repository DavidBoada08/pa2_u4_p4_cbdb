package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "propietario_web")
public class Propietario {
	
	@Id
	@SequenceGenerator(name = "seq_propietario", sequenceName = "seq_propietario", allocationSize = 1)
	@GeneratedValue(generator = "seq_propietario", strategy = GenerationType.SEQUENCE)
	@Column(name = "pro_id")
	private Integer id;
	
	@Column(name = "pro_nombre")
	private String nombre;
	
	@Column(name = "pro_apellido")
	private String apellido;

	@Column(name = "pro_cedula")
	private String cedula;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	@Override
	public String toString() {
		return "Propietario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ "]";
	}
	
	
	
	

}

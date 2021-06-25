package com.rest.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargos")
public class Cargo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcargo")
	private int idcargo;
	private String cargo;

	// Contructors
	public Cargo() {
		super();
	}

	public Cargo(int idcargo, String cargo) {
		super();
		this.idcargo = idcargo;
		this.cargo = cargo;
	}

	// Getter and setters
	public int getIdcargo() {
		return idcargo;
	}

	public void setIdcargo(int idcargo) {
		this.idcargo = idcargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// toString
	@Override
	public String toString() {
		return "Cargos [idcargo=" + idcargo + ", cargo=" + cargo + "]";
	}

}

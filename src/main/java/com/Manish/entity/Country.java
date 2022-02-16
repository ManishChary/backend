package com.Manish.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
	private List<State> state;
	
	
	@Column(name="code")
	private String code;
	
	@Column(name="name")
	private String name;

	public Country() {
		super();
	}

	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [state=" + state + ", id=" + id + ", code=" + code + ", name=" + name + "]";
	}


	

}

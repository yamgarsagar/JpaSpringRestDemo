package com.cs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CommonAttribute {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String description;
	@Column
	private Integer weight;
	@Column
	private String dimentions;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn
	private List<Color> colorList;
		
	public List<Color> getColorList() {
		return colorList;
	}
	public void setColorList(List<Color> colorList) {
		this.colorList = colorList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getDimentions() {
		return dimentions;
	}
	public void setDimentions(String dimentions) {
		this.dimentions = dimentions;
	}
}

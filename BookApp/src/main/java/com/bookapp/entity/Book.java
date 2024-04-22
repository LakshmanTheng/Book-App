package com.bookapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bname;
	private String bauthor;
	private String price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bname, String bauthor, String price) {
		super();
		this.id = id;
		this.bname = bname;
		this.bauthor = bauthor;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}
	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}
	/**
	 * @return the bauthor
	 */
	public String getBauthor() {
		return bauthor;
	}
	/**
	 * @param bauthor the bauthor to set
	 */
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}	
	
}

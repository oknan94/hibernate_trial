package MuseumHibernate.com.softserve.training.mysql.ex.CRUDS;

import java.sql.Date;

public class Exponat {
	int cod_exp;
	String name;
	Date date_of_get;
	String author;
	String material;
	String technic;
	int cod_hall;
	public int getCod_exp() {
		return cod_exp;
	}
	public void setCod_exp(int cod_exp) {
		this.cod_exp = cod_exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate_of_get() {
		return date_of_get;
	}
	public void setDate_of_get(Date date_of_get) {
		this.date_of_get = date_of_get;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getTechnic() {
		return technic;
	}
	public void setTechnic(String technic) {
		this.technic = technic;
	}
	public int getCod_hall() {
		return cod_hall;
	}
	public void setCod_hall(int cod_hall) {
		this.cod_hall = cod_hall;
	}
}

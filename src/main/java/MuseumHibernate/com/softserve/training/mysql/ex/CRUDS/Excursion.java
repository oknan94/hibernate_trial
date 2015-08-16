package MuseumHibernate.com.softserve.training.mysql.ex.CRUDS;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Excursion {
	int cod_exc;
	String name;
	Date expir_date;
	Set<Seans> seanses = new HashSet<Seans>(0);
	Set<Hall> halls = new HashSet<Hall>(0);
	Set<Worker> workers = new HashSet<Worker>(0);
	
	public Set<Seans> getSeanses() {
		return seanses;
	}
	public void setSeanses(Set<Seans> seanses) {
		this.seanses = seanses;
	}
	public int getCod_exc() {
		return cod_exc;
	}
	public void setCod_exc(int cod_exc) {
		this.cod_exc = cod_exc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getExpir_date() {
		return expir_date;
	}
	public void setExpir_date(Date expir_date) {
		this.expir_date = expir_date;
	}
}

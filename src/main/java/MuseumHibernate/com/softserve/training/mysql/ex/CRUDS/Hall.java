package MuseumHibernate.com.softserve.training.mysql.ex.CRUDS;

import java.util.HashSet;
import java.util.Set;

public class Hall {
	int cod_hall;
	String name;
	int cod_worker;
	Set<Exponat> exponats = new HashSet<Exponat>(0);
	Set<Excursion> excursions = new HashSet<Excursion>(0);
	
	public Set<Exponat> getExponats() {
		return exponats;
	}
	public void setExponats(Set<Exponat> exponats) {
		this.exponats = exponats;
	}
	public int getCod_hall() {
		return cod_hall;
	}
	public void setCod_hall(int cod_hall) {
		this.cod_hall = cod_hall;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod_worker() {
		return cod_worker;
	}
	public void setCod_worker(int cod_worker) {
		this.cod_worker = cod_worker;
	}
}

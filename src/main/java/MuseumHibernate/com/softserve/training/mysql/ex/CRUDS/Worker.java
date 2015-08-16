package MuseumHibernate.com.softserve.training.mysql.ex.CRUDS;

import java.util.HashSet;
import java.util.Set;

public class Worker {
	int cod_worker;
	String pib;
	int salary;
	String job;
	Set<Hall> halls = new HashSet<Hall>(0);
	Set<Excursion> excursions = new HashSet<Excursion>(0);
	
	public int getCod_worker() {
		return cod_worker;
	}
	public void setCod_worker(int cod_worker) {
		this.cod_worker = cod_worker;
	}
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}

package MuseumHibernate.com.softserve.training.mysql.ex.CRUDS;

import java.sql.Time;

public class Seans {
	int cod_seans;
	int cod_exc;
	String day_of;
	Time time_beg;
	Time time_end;
	public int getCod_seans() {
		return cod_seans;
	}
	public void setCod_seans(int cod_seans) {
		this.cod_seans = cod_seans;
	}
	public int getCod_exc() {
		return cod_exc;
	}
	public void setCod_excursion(int cod_exc) {
		this.cod_exc = cod_exc;
	}
	public String getDay_of() {
		return day_of;
	}
	public void setDay_of(String day_of) {
		this.day_of = day_of;
	}
	public Time getTime_beg() {
		return time_beg;
	}
	public void setTime_beg(Time time_beg) {
		this.time_beg = time_beg;
	}
	public Time getTime_end() {
		return time_end;
	}
	public void setTime_end(Time time_end) {
		this.time_end = time_end;
	}
}

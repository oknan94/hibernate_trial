package MuseumHibernate.com.softserve.training.mysql.ex.CRUDS;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	Session s = sf.openSession();
    	s.beginTransaction();
    	Worker w=new Worker();
    	w.setJob("Guide");
    	w.setPib("Pavlenko Pavlo Pavlovych");
    	w.setSalary(3500);
    	s.save(w);
    	s.getTransaction().commit();
        System.out.println( "Transaction began!" );
    }
}

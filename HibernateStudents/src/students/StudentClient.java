package students;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentClient {
	
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		factory = new Configuration().configure().buildSessionFactory();
		Student student = new Student();
		student.setName("Bill");
		student.setMarks(92);
		student.setJoinDate(new Date(System.currentTimeMillis()));
		Session session = factory.openSession();
		// factory.getCurrentSession();
		
		Transaction tnx = session.beginTransaction();
		Integer idInserted = (Integer) session.save(student);
		System.out.println("ID inserted is:" + idInserted);
		tnx.commit();
		session.close();
	}
}

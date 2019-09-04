package students;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Encapsulates a single Student (row) in the database
 * 
 * @author Mark
 *
 */
@Entity
@Table
public class Student {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
//	@Column(name = "name", nullable = false)
	private String name;
	
//	@Column(name = "marks") // , unique = false, nullable = true
	private int marks;
	
//	@Column(name = "join_date", nullable = false)
	private Date joinDate;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Date getJoinDate() {
		return joinDate;
	}
	
	public void setJoinDate(Date date) {
		this.joinDate = date;
	}
}

package assignment.db.domain;

import lombok.Data;

@Data
public class Course {
	private int co_num;
	private int co_st_num;
	private int co_le_num;
	private String co_type;
	private String co_grade;
	
	public Course() {
	}
	
	public Course(int co_num, int co_st_num, int co_le_num, String co_type, String co_grade) {
		this.co_num = co_num;
		this.co_st_num = co_st_num;
		this.co_le_num = co_le_num;
		this.co_type = co_type;
		this.co_grade = co_grade;
	}
	
	

}

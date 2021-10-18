import java.util.Date;

public class TaskReport {//TaskReport
	private int grade;//������
	private String comment;//�����������
	private Date dateStart;//����� ������
	private Date dateStop;//����� ����������
	private Deal deal;//� ������ ���� ��������� �������
	
	
	
	TaskReport(){ 
		grade = 0;
		comment = "";
	}
	
	TaskReport(Deal deal, Date dateStart,Date dateStop){ 
		this.dateStart=dateStart;
		this.dateStop=dateStop;
		this.deal=deal;
	}
	
	
	public void setGrade(int new_grade){
		grade = new_grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setComment(String new_comment) {
		comment = new_comment;
	}
	
	public String getComment () {
		return comment;
	}
	
	
	public void setMode(boolean flag) {
		//false - ������, true - ����������
		if (flag == false) {
		
			
		}
		else {
			
		}
	}
		
	public String toString() {
        return "Deal's Name: " + deal.getName() + '\n'
                + "Grade: " + grade + '\n'
                + "Time start: " + dateStart + '\n'
                + "Time stop: "+ dateStop+ '\n'
                + "Comment: "+ comment+ '\n';
	}
}

package Enhance;

public class Result {
	public int Score;
	public int ResultId;
	public int StudentId;

	public void setResultId(int ResultId) {
		this.ResultId = ResultId;
	}

	public int getResultId() {
		return ResultId;
	}

	public void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setScore(int Score) {
		this.Score = Score;
	}

	public int Score() {
		return Score;
	}

	public void display() {

		System.out.println("ResultId:" + ResultId);
		System.out.println("Score:" + Score);
		System.out.println("StudentId:" + StudentId);
	}

	public static void main(String args[]) {

	}
}
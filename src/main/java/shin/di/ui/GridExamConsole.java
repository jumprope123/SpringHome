package shin.di.ui;


import shin.di.entitiy.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;

	//기본생성자
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	//생성자
	public GridExamConsole(Exam exam) {		
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("┌──────────┬──────────┐");
		System.out.println("│   total  │    avg   │");
		System.out.println("├──────────┼──────────┤");
		 System.out.printf("│   %3d  │    %3.2f   │\n", exam.total(), exam.avg());
		System.out.println("└──────────┴──────────┘");
	}
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}

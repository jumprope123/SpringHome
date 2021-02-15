package shin.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import shin.di.entitiy.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {


	@Autowired
	private Exam exam;

	public InlineExamConsole() {
		System.out.println("constructor");
	}

	public InlineExamConsole(Exam exam)
	{
		this.exam = exam;
		System.out.println("overloaded constructor");
	}

	@Override
	public void print() {
		if (exam == null) {
			System.out.printf("total is %d, avg is %f\n",0, 0.0);
		}else {
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
		}
	}

	@Override
	public void setExam(Exam exam) {
		System.out.println("setter injection");
		this.exam = exam;
	}

}

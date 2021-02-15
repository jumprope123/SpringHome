package shin.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shin.di.entitiy.Exam;
import shin.di.entitiy.NewlecExam;
import shin.di.ui.ExamConsole;
import shin.di.ui.GridExamConsole;
import shin.di.ui.InlineExamConsole;

import java.util.ArrayList;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		

		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		Exam exam = new NewlecExam(10,10,10,10);
//		ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GridExamConsole(exam);
		console.setExam(exam);
		*/


//		ApplicationContext ctx =
//				new AnnotationConfigApplicationContext(NewlecDiConfig.class);

		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext();
		ctx.register(NewlecDiConfig.class);
		ctx.refresh();
//				new ClassPathXmlApplicationContext("setting.xml");


//		Exam exam = ctx.getBean(Exam.class);
//		System.out.println(exam.toString());

		ExamConsole console = (ExamConsole) ctx.getBean("console");
//		ExamConsole console = ctx.getBean(ExamConsole.class);
		console.print();

//		List<Exam> exams = (List<Exam>) ctx.getBean("exams");//new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));

//		for (Exam e : exams){
//			System.out.println(e);
//		}





		


	}

}

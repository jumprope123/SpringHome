package shin.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import shin.di.entitiy.Exam;
import shin.di.entitiy.NewlecExam;

@Configuration //이건 xml처럼 사용하는 클래스이다
@ComponentScan("shin.di.ui") // ui클래스 안에잇는 component들을 찾아서 객체로 만들어둬라
public class NewlecDiConfig {
    @Bean
    public Exam exam() {
            return new NewlecExam();
    } // exam은 id명과 같고, autowired로
    //생성되는 객체를 참조할때 여길 보아라.
}

package member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

    public static void main(String[] args) {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring4data.xml");
        MemberService msrv = (MemberService) ctx.getBean("msrv");

        // 회원정보 생성
        msrv.newMember();
        // 회원정보 조회
        msrv.selectMember();
        // 회원정보 상세조회
        msrv.selectOneMember();
        // 회원정보 수정
        msrv.modifyMember();
        // 회원정보 삭제
        msrv.deleteMember();
    }
}
package member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service("msrv")
public class MemberService {
    @Autowired
    private MemberDAO mdao;


    public void newMember() {
        String result = "회원 정보 생성 실패!";

        MemberVO mvo = new MemberVO();
        mvo.setUser("springHome");
        mvo.setPasswd("123456");
        mvo.setName("홍길동");
        mvo.setGrade("Gold");
        mvo.setPoints("1000");
        mvo.setRegdate("2021-01-18 10:55:00");

        if (mdao.insertMember(mvo) > 0){
            result = "회원 정보 생성 성공!";
        }

        System.out.println(result);
    }

    public void selectMember() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s\n";

        List<MemberVO> mvos = mdao.seletMember();
        Iterator<MemberVO> iter = mvos.iterator();
        while (iter.hasNext()){
            MemberVO mvo = iter.next();
            sb.append(String.format(fmt,mvo.getUser(),mvo.getGrade(),mvo.getRegdate()));
        }
        System.out.println(sb.toString());

    }

    public void selectOneMember() {
        String result = "";
        String fmt = "%10s %10s %10s %10s %10s";
        String name = "쨔니뮤니";
        MemberVO mvo = mdao.seletOneMember(name);
//        System.out.println(mvo);
        result = String.format(fmt,mvo.getUser(),mvo.getName(),mvo.getGrade(),mvo.getPoints(),mvo.getRegdate());
        System.out.println(result);
    }

    public void modifyMember() {
        String result = "업데이트 실패";
        MemberVO mvo = new MemberVO();
        mvo.setName("쨔니뮤니");
        mvo.setGrade("best");
        if (mdao.updateMember(mvo)>0);
        result = "업데이트 성공";
        System.out.println(result);
    }

    public void deleteMember() {
        String result = "삭제 실패";
        MemberVO mvo = new MemberVO();
        mvo.setName("홍길동");
        if (mdao.deleteOneMember(mvo)>0){
            result = "삭제성공"; }
        System.out.println(result);
    }
}

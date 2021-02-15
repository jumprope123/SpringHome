package member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("mdao")

public class MemberDAO {

    @Autowired
    private SqlSession sqlSession;

    public int insertMember(MemberVO mvo) {
        return sqlSession.insert("member.insertMember",mvo);
        //실행에 성공하면 update문은 0보다 큰 값을 반환한다.
    }

    public List<MemberVO> seletMember() {
        return sqlSession.selectList("member.selectList");
    }

    public MemberVO seletOneMember(String name) {
        return sqlSession.selectOne("member.selectOne",name);
    }

    public int updateMember(MemberVO mvo) {
        return sqlSession.update("member.modifyMember",mvo);
    }

    public int deleteOneMember(MemberVO mvo) {
        return sqlSession.delete("member.deleteOneMember",mvo);
    }
}

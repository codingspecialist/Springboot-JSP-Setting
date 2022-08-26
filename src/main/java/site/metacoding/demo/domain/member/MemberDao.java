package site.metacoding.demo.domain.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {

	public Integer insert(String username, String password, String email) {
		System.out.println("insert 되었습니다.");
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		return 1;
	}
	
	public Integer update(Integer id, String password) {
		System.out.println("update 되었습니다.");
		System.out.println(id);
		System.out.println(password);
		return 1;
	}
	
	public Integer deleteById(Integer id) {
		System.out.println("delete 되었습니다.");
		System.out.println(id);
		return 1;
	}
	
	public Member findById(Integer id) {
		
		Member m1 = new Member(1, "ssar", "1234", "ssar@nate.com");
		Member m2 = new Member(2, "cos", "1234", "cos@nate.com");
		
		if(id == 1) {
			return m1;
		}else if(id == 2) {
			return m2;
		}else {
			return null;
		}
	}
	
	public List<Member> findAll(){
		Member m1 = new Member(1, "ssar", "1234", "ssar@nate.com");
		Member m2 = new Member(2, "cos", "1234", "cos@nate.com");
		
		List<Member> memberList = new ArrayList<>();
		memberList.add(m1);
		memberList.add(m2);
		return memberList;
	}
}

package site.metacoding.demo.domain.member;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Member {
	private Integer id;
	private String username;
	private String password;
	private String email;
}

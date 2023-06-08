package com.root.blog.test;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 하는 요청에 대한 응답(data)을 해준다.
@RestController
public class HttpControllerTest {
	
	//인터넷 브라우저 요청은 무조건 get 요청밖에 할 수 없다.
	//http://localhost:8081/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청 : " + m.getId() + "," + m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	
	//http://localhost:8081/http/post (insert)
	@PostMapping("/http/post")
	public String postTest() {
		return "post 요청";
	}
	
	//http://localhost:8081/http/put (update)
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
	
	//http://localhost:8081/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
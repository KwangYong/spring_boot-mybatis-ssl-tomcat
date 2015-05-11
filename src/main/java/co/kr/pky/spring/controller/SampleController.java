package co.kr.pky.spring.controller;

import co.kr.pky.spring.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@Autowired
	UserMapper mapper;
	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {

		mapper.insertText();
		return "Hello, world";
	}

}

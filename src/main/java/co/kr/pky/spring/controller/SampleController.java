package co.kr.pky.spring.controller;

import co.kr.pky.spring.persistence.UserMapper;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@Autowired
	UserMapper mapper;
	
	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", 1);
		jsonObject.put("content", "Hello, world");
		return jsonObject.toJSONString();
	}
	


}

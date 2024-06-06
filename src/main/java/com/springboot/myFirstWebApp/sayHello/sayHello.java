package com.springboot.myFirstWebApp.sayHello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHello {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String hello() {
		return "Hello";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String hello_html() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>View with HTML </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<p>This is to say Hello using HTML </p>");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
		
	}
	
	@RequestMapping("say-hello-jsp")
//	@ResponseBody
	public String hello_jsp() {
		return "sayHello";
	}
	

}

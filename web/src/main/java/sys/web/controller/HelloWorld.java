package sys.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sys.entity.model.SysUser;

@Controller
public class HelloWorld {

	/**
	 * http://localhost:8080/sayHelloWorld
	 * @return
	 */
	@RequestMapping("sayHelloWorld")
	@ResponseBody
	public Object sayHelloWorld() {

		SysUser user = new SysUser();
		user.setId(0);
		user.setUsername("张三");
		user.setPassword("10086");
		return user;
	}
}

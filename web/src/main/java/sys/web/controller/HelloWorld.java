package sys.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sys.entity.model.SysUser;
import sys.mapper.dao.SysUserMapper;

@Controller
public class HelloWorld {

	@Autowired
	private SysUserMapper sysUserMapper;
	/**
	 * http://localhost:8090/sayHelloWorld
	 * @return
	 */
	@RequestMapping("sayHelloWorld")
	@ResponseBody
	public Object sayHelloWorld() {
		SysUser user = new SysUser();
		user.setUsername("helloworld");
		user.setPassword("111");
		sysUserMapper.insert(user);
		return user;
	}
}

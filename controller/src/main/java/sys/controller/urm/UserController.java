package sys.controller.urm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sys.entity.model.SysUser;
import sys.service.SysUserService;

@Slf4j
@Controller
@RequestMapping("/urm/user")
public class UserController {

	@Autowired
	private SysUserService sysUserService;

	/**
	 * http://localhost:8080/urm/user/insert?username=URM001&password=123456
	 *
	 * @return String
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public SysUser insert(SysUser record) {
		sysUserService.insert(record);
		log.info("sysUser {}", record);
		return record;
	}

}

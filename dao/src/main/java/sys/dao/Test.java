package sys.dao;

import sys.entity.model.SysUser;

public class Test {
	public static void main(String[] args) {
		SysUser user = new SysUser();
		user.setId(0);
		user.setUsername("aaa");
		user.setPassword("bbb");
		user.setPageNum(0);
		user.setPageSize(0);
		System.out.println(user);

	}
}

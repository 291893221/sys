package sys.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sys.entity.model.SysUser;
import sys.mapper.dao.SysUserMapper;

import javax.annotation.Resource;

@Slf4j
@Service
public class SysUserService extends BaseService<SysUser> {
	@Resource
	private SysUserMapper sysUserMapper;

}

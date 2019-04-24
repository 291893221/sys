package sys.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import sys.entity.model.PageEntity;
import sys.mapper.dao.BaseMapper;

import java.util.List;

@SuppressWarnings("unchecked")
public class BaseService<T extends PageEntity> {

	@Autowired
	private BaseMapper<T> mapper;

	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	public int insert(T t) {
		return mapper.insert(t);
	}

	public int insertSelective(T t) {
		return mapper.insertSelective(t);
	}

	public T selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(T t) {
		return mapper.updateByPrimaryKeySelective(t);
	}

	public int updateByPrimaryKey(T t) {
		return mapper.updateByPrimaryKey(t);
	}

	public PageInfo<T> selectPage(T t) {
		PageHelper.startPage(t.getPageNum(), t.getPageSize());
		List<T> list = mapper.list(t);
		return new PageInfo(list);
	}

	public List<T> list(T record) {
		return mapper.list(record);
	}

	public T selectBySelective(T record) {
		return mapper.selectBySelective(record);
	}
}
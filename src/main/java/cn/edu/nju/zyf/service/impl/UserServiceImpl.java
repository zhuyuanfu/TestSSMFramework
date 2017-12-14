package cn.edu.nju.zyf.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nju.zyf.dao.UserDao;
import cn.edu.nju.zyf.model.User;
import cn.edu.nju.zyf.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	Log logger = LogFactory.getLog(this.getClass());
	
	@Autowired
	private UserDao userDao;
	
	public List<User> getAll() {
		List<User> list1 = userDao.getAll(); 
		return list1;
	}

	public void createUser(User user) {
		// TODO Auto-generated method stub
		userDao.createUser(user);
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDao.deleteUser(user);
	}

	public void batchDeleteUser(List<Integer> userIds) {
		// TODO Auto-generated method stub
		userDao.batchDeleteUser(userIds);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}
	
}

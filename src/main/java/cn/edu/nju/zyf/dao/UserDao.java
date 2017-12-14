package cn.edu.nju.zyf.dao;

import java.util.List;

import cn.edu.nju.zyf.model.User;

public interface UserDao {
	List<User> getAll();
    void createUser(User user);
	void deleteUser(User user);
	void batchDeleteUser(List<Integer> userIds);
	void updateUser(User user);
}

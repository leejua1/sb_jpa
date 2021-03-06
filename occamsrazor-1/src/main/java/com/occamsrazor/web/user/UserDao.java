package com.occamsrazor.web.user;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface UserDao {

	public void insert(User user);

	public List<User> selectAll();

	public User selectOne(String userid);

	public void update(User user);

	public void delete(User user);


}

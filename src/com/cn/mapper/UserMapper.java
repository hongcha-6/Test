package com.cn.mapper;

import java.util.List;

import com.cn.entity.User;

public interface UserMapper {
	
	public User selectByIdFun(int id);
	public void insertFun(User user);
	
	public void deleteFun(Integer id);
	
	public void updateFun(User user);
	
	public User selectByIdFun(Integer id);
	
	public List<User> selectAllFun();
	
	public List <User> SelectByNameFun(String name);
	

}

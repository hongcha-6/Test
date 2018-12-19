package com.cn.biz;

import java.util.List;

import com.cn.entity.User;

public interface UserBiz {

	boolean addFun(User user);

	boolean removeFun(Integer id);

	boolean modify(User user);

	User viewByIdFun(Integer id);

	List<User> viewAllFun();

}
package com.cn.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.biz.UserBiz;
import com.cn.entity.User;
import com.cn.mapper.UserMapper;

@Service("UserBiz")
public class UserBizImpl implements UserBiz {
	@Autowired
	private UserMapper userMapper;
	
	/* (non-Javadoc)
	 * @see com.cn.biz.impl.UserBiz#addFun(com.cn.entity.User)
	 */
	@Transactional
	public boolean addFun(User user) {
		try {
			userMapper.insertFun(user);
			return true;
		}catch (Exception e) {
			System.out.println("Ìí¼ÓÊ§°Ü£¡");
			e.printStackTrace();
			return false;
		}
	}
	/* (non-Javadoc)
	 * @see com.cn.biz.impl.UserBiz#removeFun(java.lang.Integer)
	 */
	@Transactional
	public boolean removeFun(Integer id) {
		try {
			userMapper.deleteFun(id);
			return true;
		}catch (Exception e) {
			System.out.println("É¾³ýÊ§°Ü£¡");
			e.printStackTrace();
			return false;
		}
	}
	/* (non-Javadoc)
	 * @see com.cn.biz.impl.UserBiz#modify(com.cn.entity.User)
	 */
	@Transactional
	public boolean modify(User user) {
		try {
			userMapper.updateFun(user);
			return true;
		}catch (Exception e) {
			System.out.println("ÐÞ¸ÄÊ§°Ü");
			e.printStackTrace();
			return false;
		}
	}
	/* (non-Javadoc)
	 * @see com.cn.biz.impl.UserBiz#viewByIdFun(java.lang.Integer)
	 */
	@Transactional
	public User viewByIdFun(Integer id) {
		return userMapper.selectByIdFun(id);
	}
	
	/* (non-Javadoc)
	 * @see com.cn.biz.impl.UserBiz#viewAllFun()
	 */
	@Transactional(readOnly=true)
	public List<User> viewAllFun(){
		return userMapper.selectAllFun();
	}

}

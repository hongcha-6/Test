package com.cn.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cn.biz.UserBiz;
import com.cn.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserBiz userBiz;
	
	@RequestMapping("modify")
	public String modifyFun(User user) {
		userBiz.modify(user);
		return "redirect:viewAll";
	}
	
	@RequestMapping("befModify")
	/*public void befModifyFun(Integer id,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		User user=userBiz.viewByIdFun(id);
		System.out.println("111111111111");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("user",user);
		modelAndView.setViewName("modifyUser.jsp");
		
		request.setAttribute("user", user);
		request.getRequestDispatcher("../modifyUser.jsp").forward(request,response);
		
	}*/
	public ModelAndView befModifyFun(Integer id) {
		User user=userBiz.viewByIdFun(id);
		
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("user",user);
		
		modelAndView.setViewName("modifyUser");
		return modelAndView;
		
	}
	
	@RequestMapping("/remove")
	public String removeFun(Integer id) {
		userBiz.removeFun(id);
		return "redirect:viewAll";
	}
	
	@RequestMapping("/add")
	public String addFun(User user) {
		userBiz.addFun(user);
		return "redirect:viewAll";
	}
	
	@RequestMapping("/viewAll")
	public ModelAndView viewAllFun(@RequestParam(required = true,defaultValue = "1",value = "pn")Integer pn) {
		PageHelper.startPage(pn, 5);
		List<User> userList=userBiz.viewAllFun();
		PageInfo<User> pageInfo=new PageInfo<>(userList);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("userList", userList);
		modelAndView.addObject("pageInfo",pageInfo);
		modelAndView.setViewName("viewUser");
		return modelAndView;
	}
	/*public void viewAllFun(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		List<User> userList=userBiz.viewAllFun();
		
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("../viewUser.jsp").forward(request,response);
	}*/

}

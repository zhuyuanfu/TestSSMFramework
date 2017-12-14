package cn.edu.nju.zyf.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.nju.zyf.model.User;
import cn.edu.nju.zyf.service.UserService;

@Controller
@RequestMapping(value="user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="list", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<User> getAll(){
		System.out.println("this is UserController.getAll");
		return userService.getAll();
	}
	
	@RequestMapping(value="add", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public void createUser(HttpServletRequest request){
		System.out.println("this is UserController.createUser aaabc111111111111111");
		User user = new User();   
		
		user.setUserName((String)request.getParameter("userNamee"));
		user.setAge((Integer.parseInt(request.getParameter("age"))));
		userService.createUser(user);
	}
	
	
}

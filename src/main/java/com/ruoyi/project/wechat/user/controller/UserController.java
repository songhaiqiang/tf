package com.ruoyi.project.wechat.user.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.system.user.domain.User;
import com.ruoyi.project.system.user.domain.UserType;
import com.ruoyi.project.system.user.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author songhaiqiang
 * @date 2018/10/17
 */
@RestController
@RequestMapping("/wechat/user")
public class UserController extends BaseController {


	private String prefix = "wechat/user";

	@Autowired
	private IUserService userService;

	@PostMapping("/register")
	public AjaxResult register(User user){

		if(StringUtils.isBlank(user.getLoginName())){

		}

		//设置用户类型
		user.setUserType(UserType.USER.getCode());

		return toAjax(userService.insertUser(user));
	}



}

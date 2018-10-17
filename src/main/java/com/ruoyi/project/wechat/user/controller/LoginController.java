package com.ruoyi.project.wechat.user.controller;

import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 前端用户东路控制器
 * @author songhaiqiang
 * @date 2018/10/17
 */
@RestController
@RequestMapping("/wechat/login")
public class LoginController extends BaseController{


	@GetMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response)
	{
		// 如果是Ajax请求，返回Json字符串。
		if (ServletUtils.isAjaxRequest(request))
		{
			return ServletUtils.renderString(response, "{\"code\":\"1\",\"msg\":\"未登录或登录超时。请重新登录\"}");
		}

		return "login";
	}

	@PostMapping("/login")
	@ResponseBody
	public AjaxResult ajaxLogin(String username, String password, Boolean rememberMe)
	{
		UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
		Subject subject = SecurityUtils.getSubject();
		try
		{
			subject.login(token);
			return success();
		}
		catch (AuthenticationException e)
		{
			String msg = "用户或密码错误";
			if (StringUtils.isNotEmpty(e.getMessage()))
			{
				msg = e.getMessage();
			}
			return error(msg);
		}
	}
}

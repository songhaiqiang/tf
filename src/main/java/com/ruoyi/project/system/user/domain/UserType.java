package com.ruoyi.project.system.user.domain;

/**
 *
 * @author songhaiqiang
 * @date 2018/10/16
 */
public enum  UserType {

	AGENT("00", "代理商"), ADMIN("01", "管理员"), USER("02", "注册用户");

	private final String code;
	private final String info;

	UserType(String code, String info)
	{
		this.code = code;
		this.info = info;
	}

	public String getCode()
	{
		return code;
	}

	public String getInfo()
	{
		return info;
	}
}

package com.jfinal.weixin.service;

import com.jfinal.model.SysIdiomsModel;

public class SysIdiomsService {
	
public static SysIdiomsModel findByDescription(String conditionStrinig){
	
	String sql = "SELECT si.`name`,si.`description` FROM sys_idioms si WHERE si.`name` like ?";

	SysIdiomsModel sysIdiomsModel = SysIdiomsModel.dao.findFirst(sql, conditionStrinig+"%");
	return sysIdiomsModel;
}
}

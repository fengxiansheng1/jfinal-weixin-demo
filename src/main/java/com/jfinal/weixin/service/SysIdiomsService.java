package com.jfinal.weixin.service;

import com.jfinal.model.SysIdiomsModel;

public class SysIdiomsService {
	
public static SysIdiomsModel findByDescription(String conditionStrinig){
	int length=conditionStrinig.length();
	String sql = "SELECT si.`name`,si.`description` FROM sys_idioms si WHERE si.`name` like ?";
	
	String lastString=conditionStrinig.substring(length-1, length);
	
	SysIdiomsModel sysIdiomsModel = SysIdiomsModel.dao.findFirst(sql, lastString+"%");
	return sysIdiomsModel;
}
}

/**
 * Copyright (c) 2015-2016, Javen Zhou  (javenlife@126.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.jfinal.weixin.semantic;

/**
 * @author Javen
 * 2016年1月16日
 */
public class SearchObject {
	//输入文本串
	private String query;
	//需要使用的服务类别,多个用,隔开,不能为空
	private String category;
	//纬度坐标,与经度同时传入;与城市二选一传入
	private String latitude;
	//经度坐标,与纬度同时传入;与城市二选一传入
	private String longitude;
	//城市名称,与经纬度二选一传入
	private String city;
	//区域名称,在城市存在的情况下可省;与经纬度 二选一传入
	private String region;
	private String appid;
	private String uid;
	
	
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
	
}

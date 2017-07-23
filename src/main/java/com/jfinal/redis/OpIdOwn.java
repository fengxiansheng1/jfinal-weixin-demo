package com.jfinal.redis;

import java.io.Serializable;

public class OpIdOwn  implements Serializable{
	
	private String openId;//用戶的ID
	private Integer menuEventType=0;//用戶点击菜单按钮的时间啊类型
	private String currentIdioms;// 用户回答的当前的成语
	private String nextIdioms;//用户即将回答的下一个成语
	private long lastReplyTime;//回答的成语最后一次的时间
	
	
	
	

}

package com.jfinal.weixin.util;

/**
 * 
 * @author Javen
 * @Email javenlife@126.com
 * 公众平台通用接口工具类
 */
public class WeixinUtil {
	/** 
     * emoji表情转换(hex -> utf-16) 
     *  
     * @param hexEmoji 
     * @return 
     */  
    public static String emoji(int hexEmoji) {  
        return String.valueOf(Character.toChars(hexEmoji));  
    }
    
    public static void main(String[] args) {
	}
}
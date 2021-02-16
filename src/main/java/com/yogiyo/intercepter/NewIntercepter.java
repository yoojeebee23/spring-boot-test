package com.yogiyo.intercepter;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 인터셉터 클래스
 * @author jeonggukyoo
 */
@Component
public class NewIntercepter implements HandlerInterceptor {
	
	// 인터셉터 등록 path
	public List<String> pathJSP = Arrays.asList("/home");
	
	// 인터셉터 제외 path
	public List<String> ex_pathJSP = Arrays.asList("/home2");
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("home1 통과");
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

}

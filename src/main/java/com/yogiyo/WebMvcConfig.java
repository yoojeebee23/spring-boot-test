package com.yogiyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.yogiyo.intercepter.NewIntercepter;

/**
 * 인터셉터를 관리하는 클래스
 * @author jeonggukyoo
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	/**
	 * 인터셉터 객체
	 */
	@Autowired
	NewIntercepter intercepter;
	
	/**
	 * 인터셉터 등록
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(intercepter)
				.addPathPatterns(intercepter.pathJSP)
				.excludePathPatterns(intercepter.ex_pathJSP);
		
		// 인터셉터를 여러 개 추가하실 경우 밑의 코드를 이용
		/*
		registry.addInterceptor(인터셉터 객체)
				.addPathPatterns(인터셉터 객체.pathJSP)
				.excludePathPatterns(인터셉터 객체.notpathJSP);
		*/
	}
	
}

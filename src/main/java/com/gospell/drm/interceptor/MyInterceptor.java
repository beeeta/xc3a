package com.gospell.drm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义拦截器
 */
public class MyInterceptor implements HandlerInterceptor {

	/**
	 * 
	 * @param request
	 * @param response
	 * @param obj
	 * @param ex
	 * @throws Exception
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex) throws Exception {
		System.out.println("afterCompletion");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param obj
	 * @param mv
	 * @throws Exception
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mv) throws Exception {
		System.out.println("postHandler");
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		System.out.println("preHandle");
		return true;
	}
	
}

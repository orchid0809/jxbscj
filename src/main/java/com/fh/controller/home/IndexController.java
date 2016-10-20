package com.fh.controller.home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fh.util.CommUtil;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fh.common.CModelAndView;
import com.fh.controller.base.BaseController;

@Controller
@RequestMapping("/home")
public class IndexController extends BaseController{

	@RequestMapping("/index")
	public ModelAndView indexView(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new CModelAndView("index.html",request,response);
		return modelAndView;
	}
	
	@RequestMapping("/about/index")
	public ModelAndView aboutIndexView(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new CModelAndView("about/index.html",request,response);
		return modelAndView;
	}
	
	@RequestMapping("/case/index")
	public ModelAndView caseIndexView(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new CModelAndView("case/index.html",request,response);
		return modelAndView;
	}
	
	@RequestMapping("/news/index")
	public ModelAndView newsIndexView(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new CModelAndView("news/index.html",request,response);
		return modelAndView;
	}
	
	@RequestMapping("/service/index")
	public ModelAndView serviceIndexView(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new CModelAndView("service/index.html",request,response);
		return modelAndView;
	}
	
	@RequestMapping("/contact/index")
	public ModelAndView contactIndexView(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new CModelAndView("contact/index.html",request,response);
		return modelAndView;
	}
	
	@RequestMapping("/common/head")
	public ModelAndView commonHeadView(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new CModelAndView("common/head.html",request,response);
		String key = CommUtil.null2String(request.getAttribute("key"));
		modelAndView.addObject("key",key);
		return modelAndView;
	}


	/**
	 *
	 */
	@RequestMapping("/common/tail")
	public ModelAndView commonTailView(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new CModelAndView("common/tail.html",request,response);
		return modelAndView;
	}

	@RequestMapping("/add_customer_info")
	public String addCustomerInfo(){


		return "";
	}
}

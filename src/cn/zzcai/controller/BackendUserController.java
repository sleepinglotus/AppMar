package cn.zzcai.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.zzcai.pojo.BackendUser;
import cn.zzcai.service.BackendUserService;

/**
 * @author zzcai
 * @version 1.0
 * @date 2019��3��5�� ����11:45:10
 * @remark TODO
 */
@Controller
@RequestMapping("/manager")
public class BackendUserController {
	@Resource
	private BackendUserService backendUserService;
	
	//��̨��¼
	@RequestMapping("/dologin")
	public String doLogin(
			@RequestParam
			String userCode,
			@RequestParam
			String userPassword,
			HttpSession session,
			Model model) {
		BackendUser backendUser=backendUserService.doLogin(userCode, userPassword) ;
		if(backendUser==null) {
			model.addAttribute("error","�û������������");
			return "backendlogin";
		}else {
			session.setAttribute("userSession", backendUser);
			return "backend/main";
		}
	}
	
	//ע��
	@RequestMapping("/logout")
	public String doLogout(HttpSession session){
		session.removeAttribute("userSession");
		return "backendlogin";
	}
}

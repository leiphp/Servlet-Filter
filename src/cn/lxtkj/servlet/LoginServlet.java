package cn.lxtkj.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.lxtkj.entity.User;

public class LoginServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String userName = req.getParameter("uname");
//		String password = req.getParameter("upwd");
//		
//		System.out.println("用户名 ==>"+userName);
//		System.out.println("密码 ==>"+password);
//	}
	public LoginServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" =====进入doget方法=====");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" =====进入dopost方法=====");
		String uname = req.getParameter("uname");
		String passwd = req.getParameter("upwd");
		String returnUri = req.getParameter("return_uri");
		
		System.out.println("用户名 ==>"+uname);
		System.out.println("密码 ==>"+passwd);
		System.out.println("return uri ==>"+returnUri);
		
		RequestDispatcher rd = null;
		if(uname==null||passwd==null) {
			req.setAttribute("msg", "用户名或密码为空！");
			rd=req.getRequestDispatcher("/login.jsp");
			rd.forward(req, resp);
		}else {
			if(uname.equals("雷小天科技")&&passwd.equals("123456")) {
				req.getSession().setAttribute("flag", "login_success");
				if(returnUri != null) {
					rd=req.getRequestDispatcher(returnUri);
					rd.forward(req, resp);
				}else {
					rd=req.getRequestDispatcher("/index.jsp");
					rd.forward(req, resp);
				}				
				
			}else {
				req.getSession().setAttribute("flag", "login_error");
				req.setAttribute("msg", "用户名或者密码错误！");
				rd=req.getRequestDispatcher("/login.jsp");
				rd.forward(req, resp);
			}
		}
		
		
//		String forward=null;
//		if(userName.equals("雷小天科技")&&password.equals("123456")) {
//			//请求转发
//			forward="/success.jsp";
//			RequestDispatcher rd = req.getRequestDispatcher(forward);
//			rd.forward(req, resp);
//			//请求重定向
//			//resp.sendRedirect(req.getContextPath()+"/success.jsp");
//		}else {
//			//请求转发
//			forward="/error.jsp";
//			RequestDispatcher rd = req.getRequestDispatcher(forward);
//			rd.forward(req, resp);
//			//请求重定向
//			//resp.sendRedirect(req.getContextPath()+"/error.jsp");
//		}
	}

}

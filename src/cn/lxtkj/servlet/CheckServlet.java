package cn.lxtkj.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.lxtkj.entity.User;
import cn.lxtkj.service.CheckUserService;


public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CheckUserService cku = new CheckUserService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String passwd = request.getParameter("upwd");
		
		RequestDispatcher rd = null;
		String forward = null;
		
		if(uname==null||passwd==null) {
			request.setAttribute("msg", "用户名或密码为空！");
			rd=request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}else {
			User user = new User();
			user.setName(uname);
			user.setPassword(passwd);
			boolean bool = cku.check(user);
			
			if(bool) {
				forward = "/success.jsp";
			}else {
				request.setAttribute("msg", "用户名或者密码输入错误，请重新输入");
				forward = "/error.jsp";
			}
			rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
	}

}

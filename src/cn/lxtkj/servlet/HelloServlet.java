package cn.lxtkj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("===init without parameters11===");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("===init without parameters22===");
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("===service===");
		PrintWriter pw=resp.getWriter();
		pw.println("Hello world");
		pw.close();
		
	}

	@Override
	public void destroy() {
		System.out.println("===destory===");
		super.destroy();
	}

	

}

package cn.lxtkj.test;

import java.sql.Connection;

import cn.lxtkj.dao.UserDao;
import cn.lxtkj.dao.impl.UserDaoImpl;
import cn.lxtkj.entity.User;
import cn.lxtkj.util.ConnectionFactory;

public class UserDaoTest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			UserDao userDao = new UserDaoImpl();
			User tom=new User();
			tom.setName("Tom");
			tom.setPassword("123456");
			tom.setEmail("tom@gmail.com");
			
			userDao.save(conn, tom);
			conn.commit();
			
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

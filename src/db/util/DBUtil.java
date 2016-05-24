package db.util;

import java.sql.*;

public class DBUtil {
	private static String driverName;
	private static String dbURL;
	static{
		//F:/javaweb��Ҫ���ģ�Ӧ�û�ȡ��ǰ��Ŀ��·��
		//ʹ�÷�����ƻ�ȡ�����У�System.getProperty()������ȡ�����У�
		//Class.class.getClass().getResource("/").getPath()������ 
		//����ʹ��������ľ���·����ͨ�������ȡ�����ǵõ�����·���µ��ļ���������
		
		driverName = "org.sqlite.JDBC";
		dbURL="jdbc:sqlite:\\E:/workspace/GuitarSellSystem/WebContent/database/GuitarData.db";
	}
	public static Connection open(){
		try {
				Class.forName(driverName);
			try {
				return DriverManager.getConnection(dbURL);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close(Connection Conn){
		if(Conn != null){
			try {
				Conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

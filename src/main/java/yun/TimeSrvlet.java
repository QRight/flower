package yun;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeSrvlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Date d = new Date(); 
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
		req.setAttribute("time", s.format(d));
		resp.sendRedirect("time. jsp"); 
	}
}

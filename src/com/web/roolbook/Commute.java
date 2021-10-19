package com.web.roolbook;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/commute")
public class Commute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");

		String btnHongGo = req.getParameter("btnHongGo");
		String btnHongLeave = req.getParameter("btnHongLeave");
		String btnKimGo = req.getParameter("btnKimGo");
		String btnKimLeave = req.getParameter("btnKimLeave");
		String btnKangGo = req.getParameter("btnKangGo");
		String btnKangLeave = req.getParameter("btnKangLeave");
		String btnReset = req.getParameter("btnReset");

		String btnHongState = null;
		String btnKangState = null;
		String btnKimState = null;

		String btnHongState1 = null;
		String btnKangState1 = null;
		String btnKimState1 = null;

		if (btnHongGo != null) { // 홍길동 출근 버튼 눌렀을 때
			btnHongState = null;
			btnHongState1 = "ok";
			btnKimState = "ok";
			btnKimState1 = null;
			btnKangState = "ok";
			btnKangState1 = null;
		} else if (btnHongLeave != null) { // 홍길동 퇴근 버튼 눌렀을 떄
			btnHongState = "ok";
			btnKimState = "ok";
			btnKimState1 = null;
			btnKangState = "ok";
			btnKangState1 = null;
		}else if(btnKimGo != null) { // 이순신 출근 버튼 ㅌ
			btnHongState = "ok";
			btnHongState1 = null;
			btnKimState = null;
			btnKimState1 = "ok";
			btnKangState = "ok";
			btnKangState1 = null;
		}else if(btnKimLeave != null) {
			btnKimState1 = null;
			btnKimState = "ok";
			btnHongState = "ok";
			btnHongState1 = null;
			btnKangState = "ok";
			btnKangState1 = null;
		}else if(btnKangGo != null) {
			btnKangState = null;
			btnKangState1 = "ok";
			btnHongState = "ok";
			btnHongState1 = null;
			btnKimState = "ok";
			btnKimState1 = null;
		}else if(btnKangLeave != null){
			btnKangState1 = null;
			btnKangState = "ok";
			btnHongState = "ok";
			btnHongState1 = null;
			btnKimState = "ok";
			btnKimState1 = null;
		}
		else if(btnReset != null) {
			btnHongState = "ok";
			btnKangState = "ok";
			btnKimState = "ok";
		}
		req.setAttribute("btnHongState", btnHongState);
		req.setAttribute("btnHongState1", btnHongState1);
		req.setAttribute("btnKangState", btnKangState);
		req.setAttribute("btnKangState1", btnKangState1);
		req.setAttribute("btnKimState", btnKimState);
		req.setAttribute("btnKimState1", btnKimState1);
		req.setAttribute("btnHongGo", btnHongGo);
		req.setAttribute("btnHongLeave", btnHongLeave);
		req.setAttribute("btnKimGo", btnKimGo);
		req.setAttribute("btnKimLeave", btnKimLeave);
		req.setAttribute("btnKangGo", btnKangGo);
		req.setAttribute("btnKangLeave", btnKangLeave);
		req.setAttribute("btnReset", btnReset);

		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, res);
	}
}
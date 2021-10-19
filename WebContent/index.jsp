<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3교대 출퇴근 프로그램</title>
<style>
#main {
	width: 700px;
	height: 450px;
	margin: 40px auto;
	border: 10px solid #ddd;
	padding: 20px;
}
table {
	width: 100%;
	border: 5px solid #ddd;
	padding: 5px;
	margin: 5px auto;
}

td {
	width: 100px;
	border: 2px solid #aaa;
	padding: 5px;
	text-align: center;
}
.name{
	font-family: verdana;
}

input {
	size: 14px;
}
</style>
</head>
<body>
	<div id=main>
		<form action="commute" method="post">
			<table>
				<h3>출퇴근 명부</h3>
				<tr>
					<td class="employee"><img src="img/hong.png"></td>
					<td class="employee"><img src="img/dj.png"></td>
					<td class="employee"><img src="img/kang.png"></td>
				</tr>
				<tr>
					<td class="name">홍길동</td>
					<td class="name">김대중</td>
					<td class="name">강감찬</td>
				</tr>
				<tr>
					<td class="btn"><input type="submit"
						${(empty btnHongState)? "disabled" : ""} name="btnHongGo"
						value="출근"></td>
					<td class="btn"><input type="submit"
						${(empty btnKimState)? "disabled" : ""} name="btnKimGo" 
						value="출근"></td>
					<td class="btn"><input type="submit"
						${(empty btnKangState)? "disabled" : ""} name="btnKangGo"
						value="출근"></td>
				</tr>
				<tr>
					<td class="btn"><input type="submit"
						${(empty btnHongState1)? "disabled" : ""} name="btnHongLeave"
						value="퇴근"></td>
					<td class="btn"><input type="submit"
						${(empty btnKimState1)? "disabled" : ""} name="btnKimLeave"
						value="퇴근"></td>
					<td class="btn"><input type="submit"
						${(empty btnKangState1)? "disabled" : ""} name="btnKangLeave"
						value="퇴근"></td>
				</tr>
				<tr>
					<td>후번 근무자 출근시 자동 퇴근처리 됩니다.</td>
					<td>최초출근시 리셋을 눌러주세요 --> <input type="submit" value="리셋"
						name="btnReset"></td>
					<td>마지막 근무자는 퇴근 버튼 눌러주세요</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
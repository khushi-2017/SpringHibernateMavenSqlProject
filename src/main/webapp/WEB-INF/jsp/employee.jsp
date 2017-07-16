<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME TO EMPLOYEE DATA</title>
</head>
<body>
<h1>Employee Data</h1>
	<form:form action="employee.do" method="POST" commandName="employee">
		<table>
			<tr>
				<td>employee ID</td>
				<td><form:input path="employeeId" /></td>
			</tr>
			<tr>
				<td>employee Name</td>
				<td><form:input path="employeeName" /></td>
			</tr>
			<tr>
				<td>employee LastName</td>
				<td><form:input path="employeeLastName" /></td>
			</tr>
			<tr>
				<td>employee Phone</td>
				<td><form:input path="employeePhone" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="Save" />
					<input type="submit" name="action" value="Update" /> <input
					type="submit" name="action" value="Delete" /> <input type="submit"
					name="action" value="Search" /></td>
			</tr>
		</table>
	</form:form>
	<br>
	<table border="1">
		<th>Id</th>
		<th>employee Name</th>
		<th>employee LastName</th>
		<th>employee Phone</th>
		<c:forEach items="${employeeList}" var="employee">
			<tr>
				<td>${employee.employeeId}</td>
				<td>${employee.employeeName}</td>
				<td>${employee.employeeLastName}</td>
				<td>${employee.employeePhone}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
<%@ page isELIgnored="false" contentType="text/html; UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/style.css"/>
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br/>
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome !
            </h1>
            <c:forEach items="${requestScope.queryAll}" var="emp">
                <table class="table">
                    <tr class="table_header">
                        <td>
                            ID
                        </td>
                        <td>
                            Name
                        </td>
                        <td>
                            Salary
                        </td>
                        <td>
                            Age
                        </td>
                        <td>
                            Bir
                        </td>
                        <td>
                            Sex
                        </td>
                        <td>
                            Operation
                        </td>
                    </tr>
                    <tr th:class="${empState.odd ? 'row2':'row1'}" th:each="emp,empState:${emps}">
                        <td th:text="${emp.id}"/>
                        <td th:text="${emp.name}"/>
                        <td th:text="${emp.salary}"/>
                        <td th:text="${emp.age}"/>
                        <td th:text="${emp.bir}"/>
                        <td th:text="${emp.sex}"/>
                        <td>
                            <a th:href="@{/emp/delete(id=${emp.id})}">delete emp</a>&nbsp;
                            <a th:href="@{/emp/findOne(id=${emp.id})}">update emp</a>
                        </td>
                    </tr>

                </table>
            </c:forEach>
            <p>
                <a th:href="@{/emp/addEmp}">添加员工信息</a>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>

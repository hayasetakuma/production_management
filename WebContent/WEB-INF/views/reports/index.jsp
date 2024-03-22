<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">
        <h2>日報一覧</h2>
        <ul>
            <c:forEach var="report" items="${reports}">
                <li>
                    <a href="${pageContext.request.contextPath}/show?id=${report.id}">
                        <c:out value="${report.id}" />
                    </a>
                    ：<c:out value="${report.product_name}"></c:out> &gt; <c:out value="${report.product_number}" /> &gt; <c:out value="${report.defective_product}" />
                </li>
            </c:forEach>
        </ul>

        <p><a href="${pageContext.request.contextPath}/new">日報入力</a></p>

    </c:param>
</c:import>
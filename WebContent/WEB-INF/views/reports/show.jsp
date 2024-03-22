<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="../layout/app.jsp">
    <c:param name="content">

        <h2>日報詳細</h2>

        <p>製品名：<c:out value="${report.product_name}" /></p>
        <p>良品生産数：<c:out value="${report.product_number}" /></p>
        <p>不良品生産数：<c:out value="${report.defective_product}" /></p>
        <p>作成日時：<fmt:formatDate value="${report.created_at}" pattern="yyyy-MM-dd HH:mm:ss" /></p>
        <p>更新日時：<fmt:formatDate value="${report.updated_at}" pattern="yyyy-MM-dd HH:mm:ss" /></p>

        <p><a href="${pageContext.request.contextPath}/index">一覧に戻る</a></p>
        <p><a href="${pageContext.request.contextPath}/edit?id=${report.id}">編集</a></p>
    </c:param>
</c:import>
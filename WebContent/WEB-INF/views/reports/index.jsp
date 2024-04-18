<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">
        <c:if test="${flush != null}">
            <div id="flush_success">
                <c:out value="${flush}"></c:out>
            </div>
        </c:if>
        <h2>日報一覧</h2>
                <table>
                    <tbody>
                        <tr>
                            <th>製品名</th>
                            <th>良品生産数</th>
                            <th>不良品生産数</th>
                            <th>詳細表示</th>
                        </tr>
                        <c:forEach var="report" items="${reports}">
                         <tr>
                            <td><c:out value="${report.product_name}" /></td>
                            <td><c:out value="${report.product_number}" /></td>
                            <td><c:out value="${report.defective_product}" /></td>
                            <td><a href="${pageContext.request.contextPath}/show?id=${report.id}"><c:out value="詳細"/></a></td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>

        <div id="pagination">
            （全 ${reports_count} 件）<br />
            <c:forEach var="i" begin="1" end="${((reports_count - 1) / 15) + 1}" step="1">
                <c:choose>
                    <c:when test="${i == page}">
                        <c:out value="${i}" />&nbsp;
                    </c:when>
                    <c:otherwise>
                        <a href="${pageContext.request.contextPath}/index?page=${i}"><c:out value="${i}" /></a>&nbsp;
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </div>
        <p><a href="${pageContext.request.contextPath}/new">日報入力</a></p>

    </c:param>
</c:import>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tlds/HW7" prefix="myLib" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
        <style>
            td {border: 1px solid black;}
        </style>
    </head>
    <body>
        <h2>Session</h2>
        <table>
            <tr>
                <th>
                    Name
                </th>
                <th>
                    Value
                </th>
            </tr>
            <c:forEach var="i" items="${sessionScope}">
                <tr>
                    <td>
                        <c:out value="${i.key}"/>
                    </td>
                    <td>
                        <c:out value="${i.value}"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <hr>

        <h2>ServletContext</h2>
        <table>
            <tr>
                <th>
                    Name
                </th>
                <th>
                    Value
                </th>
            </tr>
            <c:forEach var="i" items="${applicationScope}">
                <tr>
                    <td>
                        <c:out value="${i.key}"/>
                    </td>
                    <td>
                        <c:out value="${i.value}"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <hr>

        <h2>Request</h2>
        <table>
            <tr>
                <th>
                    Name
                </th>
                <th>
                    Value
                </th>
            </tr>
            <c:forEach var="i" items="${requestScope}">
                <tr>
                    <td>
                        <c:out value="${i.key}"/>
                    </td>
                    <td>
                        <c:out value="${i.value}"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <hr>

        <h2>Request Parameters</h2>
        <table>
            <tr>
                <th>
                    Name
                </th>
                <th>
                    Value
                </th>
            </tr>
            <c:forEach var="i" items="${param}">
                <tr>
                    <td>
                        <c:out value="${i.key}"/>
                    </td>
                    <td>
                        <c:out value="${i.value}"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <hr>

        <h2>HTTP Headers</h2>
        <table>
            <tr>
                <th>
                    Name
                </th>
                <th>
                    Value
                </th>
            </tr>
            <c:forEach var="i" items="${header}">
                <tr>
                    <td>
                        <c:out value="${i.key}"/>
                    </td>
                    <td>
                        <c:out value="${i.value}"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <hr>

        <h2>Bean Properties</h2>
        <table>
            <tr>
                <th>Name</th>
                <th>Value</th>
            </tr>
            <myLib:beaner bean="${bean}">
                <tr>
                    <td>${name}</td>
                    <td>${value}</td>
                </tr>
            </myLib:beaner>
        </table>
        <hr>
    </body>
</html>

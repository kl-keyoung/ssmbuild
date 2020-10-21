<%--
  Created by IntelliJ IDEA.
  User: likun
  Date: 2020/9/30
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--添加隐藏域--%>
        <input type="hidden" name="bookID" value="${QIdBook.getBookID()}"/>
        书籍名称：<input type="text" name="bookName" value="${QIdBook.getBookName()}"/>
        书籍数量：<input type="text" name="bookCounts" value="${QIdBook.getBookCounts()}"/>
        书籍详情：<input type="text" name="detail" value="${QIdBook.getDetail() }"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>

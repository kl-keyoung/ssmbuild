##更新操作，需要在前端传递隐藏域，将bookID传进去
  <input type="hidden" name="bookID" value="${book.getBookID()}"/>
  
#日志乱码
tomcat配置VM options添加：-Dfile.encoding=UTF-8
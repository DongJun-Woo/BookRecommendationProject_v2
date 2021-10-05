/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-10-05 01:44:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Top.jsp", Long.valueOf(1633397854587L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1633398237611L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>ThornBooks</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/common.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/header.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/book_info.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/footer.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');

	String mem_id = (String)session.getAttribute("idKey");
	
	String log="";
	if(mem_id == null) log ="<a href=login.jsp>로그인</a>";
	else log = "<a href=logout.do>로그아웃</a>";

	String mem="";
	if(mem_id == null) mem ="<a href=Register.jsp> 마이페이지 </a>";
	else mem = "<a href=mem_info.jsp> 관리자페이지 </a>";

      out.write("\r\n");
      out.write("<div class=\"gnb\">\r\n");
      out.write("\t<div class=\"gnb-inner\">\r\n");
      out.write("\t\t");
      out.print(log);
      out.write("\r\n");
      out.write("\t\t<a href=\"join.jsp\">회원가입</a>\r\n");
      out.write("\t\t");
      out.print(mem);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<a href=\"index.jsp\">\r\n");
      out.write("\t\t\t\t<h2>ThornBooks</h2>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t<button></button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"book-info\">\r\n");
      out.write("\t\t\t\t<h2>책 정보</h2>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<div class=\"book-img\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/book4.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"book-detail\">\r\n");
      out.write("\t\t\t\t\t\t<h1>봄처럼 너에게 간다</h1>\r\n");
      out.write("\t\t\t\t\t\t<p>저자 : 홍길동</p>\r\n");
      out.write("\t\t\t\t\t\t<p>가격 : 7800원</p>\r\n");
      out.write("\t\t\t\t\t\t<p>줄거리 : </p>\r\n");
      out.write("\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t심장의 고동을 들어 보라 청춘의 피는 끓는다 끓는 피에 뛰노는 심장은 거선의 기관과 같이 힘있다 이것이다\r\n");
      out.write("<br><br>\r\n");
      out.write("그러므로 그들은 길지 아니한 목숨을 사는가 싶이 살았으며 그들의 그림자는 천고에 사라지지 않는 것이다 이것은 현저하게 일월과 같은 예가 되려니와 그와 같지 못하다 할지라도\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"bookStore-link\">\r\n");
      out.write("\t\t\t\t<h3>책 구매하러 가기</h3>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<a href=\"http://www.kyobobook.co.kr/index.laf\"><img src=\"images/kyobo.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.aladin.co.kr/home/welcome.aspx\"><img src=\"images/aladin.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"http://book.interpark.com/bookPark/html/book.html\"><img src=\"images/interpark.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<div class=\"footer-inner\">\r\n");
      out.write("\t\t\t\t<div class=\"footer-logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\">ThornBooks</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t사업자 등록번호: 1234-1234<br>\r\n");
      out.write("\t\t\t\t\t대표전화:1234-1234<br>\r\n");
      out.write("\t\t\t\t\t인천광역시\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sns\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#none\"><img src=\"images/facebook.png\" alt=\"facebook\"></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#none\"><img src=\"images/kakao-talk.png\" alt=\"kakao-talk\"></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#none\"><img src=\"images/twitter.png\" alt=\"twitter\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"script/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"script/index-crawler.js\"></script>\r\n");
      out.write("\t<script src=\"script/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

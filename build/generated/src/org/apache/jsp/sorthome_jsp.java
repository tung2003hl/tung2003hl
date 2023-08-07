package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sorthome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("        <title>Maura Diner</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400\" rel=\"stylesheet\" />    \n");
      out.write("        <link href=\"css/templatemo-style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/all.min.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body> \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Top box -->\n");
      out.write("            <!-- Logo & Site Name -->\n");
      out.write("            <div class=\"placeholder\">\n");
      out.write("                <div class=\"parallax-window\" data-parallax=\"scroll\" data-image-src=\"img/simple-house-01.jpg\">\n");
      out.write("                    <div class=\"tm-header\">\n");
      out.write("                        <div class=\"row tm-header-inner\">\n");
      out.write("                            <div class=\"col-md-6 col-12\">\n");
      out.write("                                <img src=\"img/simple-house-logo.png\" alt=\"Logo\" class=\"tm-site-logo\" /> \n");
      out.write("                                <div class=\"tm-site-text-box\">\n");
      out.write("                                    <h1 class=\"tm-site-title\">Maura Diner</h1>\n");
      out.write("                                    <h6 class=\"tm-site-description\">best for students in HOLA</h6>\t\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <nav class=\"col-md-8 col-12 tm-nav\">\n");
      out.write("                                <ul class=\"tm-nav-ul\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <li class=\"tm-nav-li\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.role == 1 && a.id!=null ? \"\" : \"shophome\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"tm-nav-link active \">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.role == 1 && a.id!=null ? \"\" : \"Home\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                    <li class=\"tm-nav-li\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.role == 1 && a.id!=null ? \"alist\" : \"list\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" class=\"tm-nav-link \">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.role == 1 && a.id!=null ? \"Manager\" : \"Shop\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <li class=\"tm-nav-li\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.role == 1 ? \"revenue\" : \"cart.jsp\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"tm-nav-link \">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.role == 1 && a.id!=null ? \"Revenue statistics\" : \"Cart\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                    <li class=\"tm-nav-li\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.id == null ? \"login.jsp\" : \"profile.jsp\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" class=\"tm-nav-link\">Profile</a></li>\n");
      out.write("                                    <li class=\"tm-nav-li\"><a href=\"logout\" class=\"tm-nav-link\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.id == null ? \"\" : \"Log Out\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <main>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h3></h3>\n");
      out.write("                <div class=\"tm-container-inner-2 tm-contact-section\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <form action=\"shophome\" class=\"tm-contact-form\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <!--<input type=\"hidden\" name=\"cid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>-->\n");
      out.write("                                    <div class=\" tm-d-flex\" >\n");
      out.write("                                        <select name=\"sortbyday\"> \n");
      out.write("                                            <option value=\"today\">Today</option> \n");
      out.write("                                            <option value=\"3dayslast\">Last 3 days</option>\n");
      out.write("                                            <option value=\"7dayslast\">last 7 days</option>\n");
      out.write("                                            <option value=\"all\">All</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <div class=\"form-group tm-d-flex\">\n");
      out.write("                                            <input type=\"submit\" class=\"tm-btn tm-btn-success tm-btn\" value=\"Select by day\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("                <style>\n");
      out.write("                    .page-link {\n");
      out.write("                        padding: 0.375rem 0.75rem;\n");
      out.write("                    }\n");
      out.write("                    .pagination {\n");
      out.write("                        display: flex;\n");
      out.write("                        padding-left: 0;\n");
      out.write("                        list-style: none;\n");
      out.write("                        justify-content: center\n");
      out.write("                    }\n");
      out.write("                    .page-link-detail{\n");
      out.write("                        background-color: #319966;\n");
      out.write("                        color: white;\n");
      out.write("                        padding: 5px\n");
      out.write("                    }\n");
      out.write("                    .page-item-detail{\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                    .page-item.active .page-link {\n");
      out.write("                        z-index: 3;\n");
      out.write("                        text-decoration: none;\n");
      out.write("                        color: #319966;\n");
      out.write("                        background-color: transparent\n");
      out.write("                    }\n");
      out.write("                    .page-item.disabled .page-link {\n");
      out.write("\n");
      out.write("                        pointer-events: none;\n");
      out.write("                        color: #319966;\n");
      out.write("                        background-color: transparent;\n");
      out.write("                        border-color: #dee2e6;\n");
      out.write("                    }\n");
      out.write("                    .pagination-lg .page-item:first-child .page-link {\n");
      out.write("                        border-top-left-radius: 0.3rem;\n");
      out.write("                        border-bottom-left-radius: 0.3rem;\n");
      out.write("                    }\n");
      out.write("                    .pagination-lg .page-item:last-child .page-link {\n");
      out.write("                        border-top-right-radius: 0.3rem;\n");
      out.write("                        border-bottom-right-radius: 0.3rem;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("\n");
      out.write("            </main>\n");
      out.write("            <div class=\"tm-container-inner tm-featured-image\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"placeholder-2\">\n");
      out.write("                            <div class=\"parallax-window-2\" data-parallax=\"scroll\" data-image-src=\"img/simple-house-01.jpg\"></div>\t\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <footer class=\"tm-footer\">\n");
      out.write("                <div class=\"tm-address\">\n");
      out.write("                    <h4 class=\"tm-info-title tm-text-success\">Our Address</h4>\n");
      out.write("                    <address>\n");
      out.write("                        Somewhere in HOLA\n");
      out.write("                    </address>\n");
      out.write("                    <a href=\"tel:0395931502\" class=\"tm-contact-link\">\n");
      out.write("                        <i class=\"fas fa-phone tm-contact-icon\"></i>0395931502\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"mailto:no.72bylc@gmail.com\" class=\"tm-contact-link\">\n");
      out.write("                        <i class=\"fas fa-envelope tm-contact-icon\"></i>no.72bylc@gmail.com\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"tm-contact-social\">\n");
      out.write("                        <a href=\"https://www.facebook.com/btrg2112/\" class=\"tm-social-link\"><i class=\"fab fa-facebook tm-social-icon\"></i></a>\n");
      out.write("                        <a href=\"https://www.instagram.com/maura.2112/\" class=\"tm-social-link\"><i class=\"fab fa-instagram tm-social-icon\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/parallax.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                                    $(document).ready(function () {\n");
      out.write("                                                        // Handle click on paging links\n");
      out.write("                                                        $('.tm-paging-link').click(function (e) {\n");
      out.write("                                                            e.preventDefault();\n");
      out.write("\n");
      out.write("                                                            var page = $(this).text().toLowerCase();\n");
      out.write("                                                            $('.tm-gallery-page').addClass('hidden');\n");
      out.write("                                                            $('#tm-gallery-page-' + page).removeClass('hidden');\n");
      out.write("                                                            $('.tm-paging-link').removeClass('active');\n");
      out.write("                                                            $(this).addClass(\"active\");\n");
      out.write("                                                        });\n");
      out.write("                                                    });\n");
      out.write("                                                    function buy(id) {\n");
      out.write("                                                        document.f.action = \"buy?id=\" + id;\n");
      out.write("                                                        document.f.submit();\n");
      out.write("                                                        //                                                          document.getElementById('myform').submit();\n");
      out.write("                                                    }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("a");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("size");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.sortby!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                    <h2 class=\"form-group\" style=\"text-align: center\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.sortby}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&nbsp; Feature Products</h2>\n");
        out.write("                    <div class=\"row tm-gallery\">\n");
        out.write("                        <div id=\"tm-gallery-page-pizza\" class=\"tm-gallery-page\">\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("   \n");
        out.write("                        </div> \n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("                    <h2 class=\"form-group\" style=\"text-align: center\">New Product</h2>\n");
        out.write("                    <div class=\"row tm-gallery\">\n");
        out.write("                        <div id=\"tm-gallery-page-pizza\" class=\"tm-gallery-page\">\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("   \n");
        out.write("                        </div> \n");
        out.write("                    </div>\n");
        out.write("                    <h2 class=\"form-group\" style=\"text-align: center\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.sortby}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&nbsp; Most Sold</h2>\n");
        out.write("                    <div class=\"row tm-gallery\">\n");
        out.write("                        <div id=\"tm-gallery-page-pizza\" class=\"tm-gallery-page\">\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("   \n");
        out.write("                        </div> \n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.prodRevenue}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("f");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <form action=\"buy\" method=\"post\" id=\"myform\">\n");
          out.write("                                    <article class=\"col-lg-3 col-md-4 col-sm-6 col-3 tm-gallery-item\" >\n");
          out.write("                                        <figure><a cursor-p href=\"detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                <img src=\"img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"250px\" width=\"250px\" alt=\"Image\" class=\" tm-gallery-img\" /></a>\n");
          out.write("                                            <figcaption>\n");
          out.write("                                                <h4 class=\"tm-gallery-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("\n");
          out.write("                                                <p class=\"tm-gallery-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" đ</p>\n");
          out.write("\n");
          out.write("                                                <div class=\"form-group tm-d-flex\">\n");
          out.write("                                                    <div class=\"form-group\">\n");
          out.write("                                                        <input type=\"number\" name=\"num\" value=\"\" class=\"form-control\" placeholder=\"Quantity\" required=\"\" />\n");
          out.write("                                                        <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <input type=\"submit\" class=\"tm-btn tm-btn-success tm-btn\" onclick=\"buy('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\"  value=\"Buy now!\">\n");
          out.write("                                                </div>\n");
          out.write("                                            </figcaption>\n");
          out.write("                                        </figure>\n");
          out.write("                                    </article>\n");
          out.write("                                </form>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("n");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <form action=\"buy\" method=\"post\" id=\"myform\">\n");
          out.write("                                    <article class=\"col-lg-3 col-md-4 col-sm-6 col-3 tm-gallery-item\" >\n");
          out.write("                                        <figure><a cursor-p href=\"detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                <img src=\"img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"250px\" width=\"250px\" alt=\"Image\" class=\" tm-gallery-img\" /></a>\n");
          out.write("                                            <figcaption>\n");
          out.write("                                                <h4 class=\"tm-gallery-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("\n");
          out.write("                                                <p class=\"tm-gallery-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" đ</p>\n");
          out.write("\n");
          out.write("                                                <div class=\"form-group tm-d-flex\">\n");
          out.write("                                                    <div class=\"form-group\">\n");
          out.write("                                                        <input type=\"number\" name=\"num\" value=\"\" class=\"form-control\" placeholder=\"Quantity\" required=\"\" />\n");
          out.write("                                                        <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <input type=\"submit\" class=\"tm-btn tm-btn-success tm-btn\" onclick=\"buy('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\"  value=\"Buy now!\">\n");
          out.write("                                                </div>\n");
          out.write("                                            </figcaption>\n");
          out.write("                                        </figure>\n");
          out.write("                                    </article>\n");
          out.write("                                </form>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.prodQuantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("m");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <form action=\"buy\" method=\"post\" id=\"myform\">\n");
          out.write("                                    <article class=\"col-lg-3 col-md-4 col-sm-6 col-3 tm-gallery-item\" >\n");
          out.write("                                        <figure><a cursor-p href=\"detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                <img src=\"img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" height=\"250px\" width=\"250px\" alt=\"Image\" class=\" tm-gallery-img\" /></a>\n");
          out.write("                                            <figcaption>\n");
          out.write("                                                <h4 class=\"tm-gallery-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("\n");
          out.write("                                                <p class=\"tm-gallery-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" đ</p>\n");
          out.write("\n");
          out.write("                                                <div class=\"form-group tm-d-flex\">\n");
          out.write("                                                    <div class=\"form-group\">\n");
          out.write("                                                        <input type=\"number\" name=\"num\" value=\"\" class=\"form-control\" placeholder=\"Quantity\" required=\"\" />\n");
          out.write("                                                        <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <input type=\"submit\" class=\"tm-btn tm-btn-success tm-btn\" onclick=\"buy('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\"  value=\"Buy now!\">\n");
          out.write("                                                </div>\n");
          out.write("                                            </figcaption>\n");
          out.write("                                        </figure>\n");
          out.write("                                    </article>\n");
          out.write("                                </form>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}

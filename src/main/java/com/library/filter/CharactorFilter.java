package com.library.filter;

/**
 * Date: 2020/12/22 9:02
 */
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class CharactorFilter implements Filter { //继承Filter类
    //字符编码
    String encoding=null;
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        if(encoding!=null){
            //设置request字符编码
            request.setCharacterEncoding(encoding);
            //设置response字符编码
            response.setContentType("text/html;charset="+encoding);
        }
        //传递给下一个过滤器
        chain.doFilter(request, response);
    }
    public void init(FilterConfig filterConfig) throws ServletException {
        //获取初始化参数
        encoding=filterConfig.getInitParameter("encoding");
    }
    public void destroy() {
        // TODO Auto-generated method stub
        encoding=null;
    }
}
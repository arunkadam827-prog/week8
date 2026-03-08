package com.taskmanager.security;

import javax.servlet.*;
import java.io.IOException;

public class JwtAuthenticationFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        chain.doFilter(request,response);
    }

}

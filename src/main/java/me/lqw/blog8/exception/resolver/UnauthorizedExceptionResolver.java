package me.lqw.blog8.exception.resolver;

import me.lqw.blog8.exception.UnauthorizedException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Map;

/**
 * 未授权异常
 * 在未登录的情况下，访问授权资源抛出的异常
 *
 * @author liqiwen
 * @version 1.0
 * @since 1.0
 */
public class UnauthorizedExceptionResolver implements ExceptionResolver {

    /**
     * 是否匹配未授权异常
     *
     * @param ex ex
     * @return false | true
     */
    @Override
    public boolean match(Exception ex) {
        return ex instanceof UnauthorizedException;
    }

    /**
     * 从异常中读取错误
     *
     * @param request request
     * @param ex      ex
     * @return Map<String, Object>
     */
    @Override
    public Map<String, Object> readErrors(HttpServletRequest request, Exception ex) {
        return Collections.singletonMap("errors", ((UnauthorizedException) ex).getError());
    }

    /**
     * 设置异常产生的状态码
     *
     * @param request request
     * @param ex      ex
     * @return status HttpStatus
     */
    @Override
    public int getStatus(HttpServletRequest request, Exception ex) {
        return HttpServletResponse.SC_UNAUTHORIZED;
    }
}
package me.lqw.blog8.model.dto.common;

import me.lqw.blog8.model.dto.page.PageResult;

import java.io.Serializable;

/**
 * 查询返回结果集封装
 *
 * @author liqiwen
 * @version 1.2
 * @since 1.2
 */
public class QR extends CR<PageResult<?>> implements Serializable {

    /**
     * 查询结果数据返回
     *
     * @param pageResult pageResult
     */
    public QR(PageResult<?> pageResult) {
        super(pageResult);
    }
}

/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.github.xiaoymin.knife4j.aggre.core;

import com.github.xiaoymin.knife4j.aggre.core.pojo.BasicAuth;
import com.github.xiaoymin.knife4j.aggre.core.pojo.HeaderWrapper;

import javax.servlet.http.Part;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 *
 * @since:knife4j-aggregation-spring-boot-starter 2.0.8
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2020/10/29 20:34
 */
public class RouteRequestContext {
    /**
     * 当前请求的接口地址
     */
    private String originalUri;
    /**
     * 请求接口
     */
    private String url;
    /**
     * 请求类型
     */
    private String method;
    /**
     * 请求头
     */
    private List<HeaderWrapper> headers=new ArrayList<>();
    /**
     * 查询参数
     */
    private Map<String,String> params=new HashMap<>();
    /**
     * 文件
     */
    private List<Part> parts=new ArrayList<>();

    /**
     * 请求内容
     */
    private InputStream requestContent;

    /**
     * 请求长度
     */
    private Long contentLength;
    /**
     * Basic验证
     */
    private BasicAuth basicAuth;

    /**
     * 添加请求头
     * @param key 请求头
     * @param value 值
     */
    public void addHeader(String key,String value){
        this.headers.add(new HeaderWrapper(key,value));
    }

    /**
     * 添加params参数
     * @param name 参数名称
     * @param value 参数值
     */
    public void addParam(String name,String value){
        this.params.put(name,value);
    }

    /**
     * 增加文件参数
     * @param part  文件
     */
    public void addPart(Part part){
        this.parts.add(part);
    }

    public BasicAuth getBasicAuth() {
        return basicAuth;
    }

    public void setBasicAuth(BasicAuth basicAuth) {
        this.basicAuth = basicAuth;
    }

    public String getOriginalUri() {
        return originalUri;
    }

    public void setOriginalUri(String originalUri) {
        this.originalUri = originalUri;
    }

    public Long getContentLength() {
        return contentLength;
    }

    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<HeaderWrapper> getHeaders() {
        return headers;
    }

    public void setHeaders(List<HeaderWrapper> headers) {
        this.headers = headers;
    }

    public InputStream getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(InputStream requestContent) {
        this.requestContent = requestContent;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }
}

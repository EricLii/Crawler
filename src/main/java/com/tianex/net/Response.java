package com.tianex.net;

import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Http响应的接口，如果用户需要自定义http响应，需要实现这个接口
 * @author ex
 */
public interface Response {

    public URL getUrl();

    /**
     * 返回http响应码
     * @return http响应码
     */
    public int getCode();

    /**
     * 返回指定http响应头字段的值
     * @param name 头字段的名称
     * @return 指定http响应头字段的值
     */
    public List<String> getHeader(String name);

    /**
     * 返回http响应头字段的Map
     * @return http响应头字段的Map
     */
    public Map<String, List<String>> getHeaders();

    /**
     * 设置http响应头字段的Map
     * @param headers http响应头字段的Map
     */
    public void setHeaders(Map<String, List<String>> headers);

    /**
     * 返回http响应中的content-type，返回的content-type会影响到爬取/解析流程中
     * 对状态的判断
     * @return http响应中的content-type
     */
    public String getContentType();

    /**
     * 返回网页/文件的内容(byte数组)
     * @return 网页/文件的内容(byte数组)
     */
    public byte[] getContent();
}

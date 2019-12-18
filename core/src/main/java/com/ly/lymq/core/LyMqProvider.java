package com.ly.lymq.core;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author liaoyi@qding.me
 * @version v1.0
 * Date: 2019/12/18 17:09
 * @since [产品/模块版本]
 */
public interface LyMqProvider {
    /**
    *  get message
     * @since  [产品/模块版本]
     * @author  liaoyi@qding.me
     * @version v1.0
     * @Date: 2019/12/18 17:17
     * @return  <T> T 返回结果
     */
    <T> T get();

}

package com.ly.lymq.core;

import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author liaoyi@qding.me
 * @version v1.0
 * Date: 2019/12/18 17:27
 * @since [产品/模块版本]
 */
public interface QueueFactory {
    /**
    * 创建队列
     * <功能详细描述>
     * @since  [产品/模块版本]
     * @author  liaoyi@qding.me
     * @version v1.0
     * @Date: 2019/12/18 17:29
     * @param num 队列的数量
     * @param groupName 队列组名称
     */
    void createQueue(int num, List<String> groupName);
    /**
    *  将消息插入队列
     * <功能详细描述>
     * @since  [产品/模块版本]
     * @author  liaoyi@qding.me
     * @version v1.0
     * @Date: 2019/12/18 17:46
     */
    void push(String message);
}

package com.ly.lymq.core;

import com.ly.lymq.common.exception.QueueGroupException;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author liaoyi@qding.me
 * @version v1.0
 * Date: 2019/12/18 17:30
 * @since [产品/模块版本]
 */
public abstract class AbstractQueueFactory implements QueueFactory {


    private Map<String, List<Queue>> groupMap = new ConcurrentHashMap<>();

    @Override
    public void createQueue(int num, List<String> groupName) {

        if (CollectionUtils.isEmpty(groupName)) {
            throw new QueueGroupException("group name can not be null");
        }
        for (String name : groupName) {
            List<Queue> queueList = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                queueList.add(new DelayQueue());
            }
        groupMap.put(name, queueList);
        }
    }
}

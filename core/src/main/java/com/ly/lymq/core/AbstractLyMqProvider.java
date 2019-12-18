package com.ly.lymq.core;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author liaoyi@qding.me
 * @version v1.0
 * Date: 2019/12/18 17:24
 * @since [产品/模块版本]
 */
public abstract class AbstractLyMqProvider  implements LyMqProvider{

    private static final Integer OFFSET_FIRST=1;

    @Override
    public <T> T get() {
        return null;
    }
}

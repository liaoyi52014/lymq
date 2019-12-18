package com.ly.lymq.common.exception;

import java.io.PrintStream;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author liaoyi@qding.me
 * @version v1.0
 * Date: 2019/12/18 17:41
 * @since [产品/模块版本]
 */
public class QueueGroupException extends RuntimeException {
    public QueueGroupException() {
        super();
    }

    public QueueGroupException(String message) {
        super(message);
    }

    public QueueGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueGroupException(Throwable cause) {
        super(cause);
    }

    protected QueueGroupException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }
}

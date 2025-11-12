package com.harvey.se.exception;

/**
 * UncompletedException的异常
 *
 * @author <a href="mailto:harvey.blocks@outlook.com">Harvey Blocks</a>
 * @version 1.0
 * @date 2025-11-08 00:18
 */
public class UncompletedException extends RuntimeException {

    public UncompletedException(String message) {
        super(message);
    }

    public UncompletedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncompletedException(Throwable cause) {
        super(cause);
    }

    protected UncompletedException(
            String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

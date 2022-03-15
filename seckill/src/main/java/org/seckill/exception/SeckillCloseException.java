package org.seckill.exception;

/**
 * 秒杀关闭异常；当秒杀结束，用户还要进行这个秒杀就会出现该异常
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message){
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause){
        super(message, cause);
    }
}

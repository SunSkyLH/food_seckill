package org.seckill.exception;

/**
 * 重复秒杀异常(运行期异常)
 * java异常主要分为编译期异常和运行期异常，运行期异常不需要手动try catch,
 * 另外Spring的声明式事务只接受运行期异常回滚策略
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message){
        super(message);
    }

    public RepeatKillException(String message, Throwable cause){
        super(message, cause);
    }
}

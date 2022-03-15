package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() {
        /*
        第一次：insertCount=0
        第二次：insertCount=1
         */
        long id = 1001L;
        long phone = 13502181181L;
        int insertCount = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println("insertCount=" + insertCount);
    }

    @Test
    public void queryByIdWithSeckill() {
        long id = 1001L;
        long phone = 13502181181L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
        /*
        SuccessKilled{
            seckillId=1001,
            userPhone=13502181181,
            state=0,
            createTime=null
            }
        Seckill{
            seckillId=1001,
            name='30.9元秒杀三人套餐',
            number=200,
            startTime=Mon Jan 10 00:00:00 CST 2022,
            endTime=Tue Jan 11 00:00:00 CST 2022,
            createTime=Tue Mar 08 20:44:08 CST 2022
            }
         */
    }
}
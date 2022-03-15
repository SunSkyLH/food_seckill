package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    // 注入Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void queryById() {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
//        Seckill{
//        seckillId=1000,
//        name='20.9元秒杀双人套餐',
//        number=100,
//        startTime=Mon Jan 10 00:00:00 CST 2022,
//        endTime=Tue Jan 11 00:00:00 CST 2022,
//        createTime=Tue Mar 08 20:44:08 CST 2022}
    }

    @Test
    public void queryAll() {
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        for (Seckill seckill : seckills){
            System.out.println(seckill);
        }
//        Seckill{seckillId=1000, name='20.9元秒杀双人套餐', number=100, startTime=Mon Jan 10 00:00:00 CST 2022, endTime=Tue Jan 11 00:00:00 CST 2022, createTime=Tue Mar 08 20:44:08 CST 2022}
//        Seckill{seckillId=1001, name='30.9元秒杀三人套餐', number=200, startTime=Mon Jan 10 00:00:00 CST 2022, endTime=Tue Jan 11 00:00:00 CST 2022, createTime=Tue Mar 08 20:44:08 CST 2022}
//        Seckill{seckillId=1002, name='40.9元秒杀四人套餐', number=300, startTime=Mon Jan 10 00:00:00 CST 2022, endTime=Tue Jan 11 00:00:00 CST 2022, createTime=Tue Mar 08 20:44:08 CST 2022}
//        Seckill{seckillId=1003, name='50.9元秒杀多人套餐', number=400, startTime=Mon Jan 10 00:00:00 CST 2022, endTime=Tue Jan 11 00:00:00 CST 2022, createTime=Tue Mar 08 20:44:08 CST 2022}
    }

    @Test
    public void reduceNumber() {
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000L, killTime);
        System.out.println("updateCount=" + updateCount);
    }


}
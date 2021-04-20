package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fancc
 * @email bestfancc@gmail.com
 * @date 2021-03-11 18:09:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

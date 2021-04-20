package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author fancc
 * @email bestfancc@gmail.com
 * @date 2021-03-11 18:11:11
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}

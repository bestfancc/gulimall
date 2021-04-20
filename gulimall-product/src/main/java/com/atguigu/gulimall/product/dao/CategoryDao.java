package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fancc
 * @email bestfancc@gmail.com
 * @date 2021-03-11 15:24:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

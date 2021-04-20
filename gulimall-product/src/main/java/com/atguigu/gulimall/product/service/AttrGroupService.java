package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.AttrGroupVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrGroupEntity;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author fancc
 * @email bestfancc@gmail.com
 * @date 2021-03-11 15:24:06
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catlogId);

    List<AttrGroupVo> getAttrGroupWithAttrByCatelogId(Long catelogId);
}


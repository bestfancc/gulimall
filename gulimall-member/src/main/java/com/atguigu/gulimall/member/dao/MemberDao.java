package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fancc
 * @email bestfancc@gmail.com
 * @date 2021-03-11 17:53:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lixianfeng
 * @email iswangsq@163.com
 * @date 2020-06-21 19:12:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

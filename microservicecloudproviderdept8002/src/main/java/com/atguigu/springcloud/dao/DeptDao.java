package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * description
 *
 * @author 赵林杰 2019/03/27 11:56
 */
@Mapper
public interface DeptDao {

    public Dept findById(Long id);

    public List<Dept> findAll();

    public boolean addDept(Dept dept);

}

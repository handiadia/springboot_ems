package com.baizhi.dao;

import com.baizhi.entity.Work;

import java.util.List;

public interface WorkDAO {
    /*查询所有*/
    List<Work> queryAll();

    /*删除一个*/
    void remove(String id);

    /*修改*/
    void update(Work work);

    /*根据id查询单个员工*/
    Work queryOneId(String id);

    /*添加一个员工信息*/
    void save(Work work);
}

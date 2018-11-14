package com.baizhi.service;


import com.baizhi.dao.WorkDAO;
import com.baizhi.entity.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("workService")
@Transactional
public class WorkServiceImpl implements WorkService {
    @Autowired
    private WorkDAO workDAO;

    @Override
    public List<Work> queryAll() {
        return workDAO.queryAll();
    }

    @Override
    public void remove(String id) {
        workDAO.remove(id);
    }

    @Override
    public void update(Work work) {
        workDAO.update(work);
    }

    @Override
    public Work queryOneId(String id) {
        return workDAO.queryOneId(id);
    }

    @Override
    public void save(Work work) {

    }
}

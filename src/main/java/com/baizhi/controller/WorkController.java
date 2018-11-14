package com.baizhi.controller;

import com.baizhi.entity.Work;
import com.baizhi.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("work")
public class WorkController {
    @Autowired
    private WorkService workService;

    @RequestMapping("queryAll")
    public String queryAll(HttpServletRequest request) {
        List<Work> works = workService.queryAll();
        /*存入作用域*/
        HttpSession session = request.getSession();
        session.setAttribute("queryAll", works);
        return "emplist";
    }

    @RequestMapping("save")
    public void save(Work work) {
        workService.save(work);

    }
    @RequestMapping("update")
    public void update(Work work) {
        workService.update(work);
    }

    @RequestMapping("remove")
    public void remove(String id) {
        workService.remove(id);
    }

    @RequestMapping("queryOneId")
    public void queryOneId(String id) {
        workService.queryOneId(id);
    }

}

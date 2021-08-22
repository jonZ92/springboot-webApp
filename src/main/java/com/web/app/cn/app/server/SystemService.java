package com.web.app.cn.app.server;

import com.web.app.cn.app.dao.SystemsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author jon
 * @date 2021年08月22日 10:24
 */

@Service
public class SystemService {
    @Autowired
    private SystemsDao dao;


    public List<Map<String, Object>> test() {
        return dao.querySystem();
    }
}

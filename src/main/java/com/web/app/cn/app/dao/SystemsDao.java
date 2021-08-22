package com.web.app.cn.app.dao;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SystemsDao {
    List<Map<String,Object>> querySystem();
}

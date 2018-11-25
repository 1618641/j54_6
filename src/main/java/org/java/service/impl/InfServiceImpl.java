package org.java.service.impl;

import org.java.dao.InfMapper;
import org.java.service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: 马果
 * @Date: 2018/11/23 08:48
 * @Description:
 */
@Service
public class InfServiceImpl implements InfService {

    @Autowired
    private InfMapper mapper;

    @Override
    public List<Map<String, Object>> getList() {
        return mapper.getList();
    }
}

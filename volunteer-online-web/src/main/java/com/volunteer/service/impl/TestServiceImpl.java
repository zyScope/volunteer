package com.volunteer.service.impl;

import com.volunteer.entity.TestTable;
import com.volunteer.mapper.TestMapper;
import com.volunteer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestMapper testMapper;
    @Override
    public List<TestTable> getList() {
        List<TestTable> list =testMapper.getList();
        return list;
    }
}

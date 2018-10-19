package com.volunteer.mapper;

import com.volunteer.entity.TestTable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    List<TestTable> getList();
}

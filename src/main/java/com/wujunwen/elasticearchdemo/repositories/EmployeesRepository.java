package com.wujunwen.elasticearchdemo.repositories;

import com.wujunwen.elasticearchdemo.entity.EmployeesDO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EmployeesRepository extends ElasticsearchRepository<EmployeesDO,Integer> {


}

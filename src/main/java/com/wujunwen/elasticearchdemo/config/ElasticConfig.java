package com.wujunwen.elasticearchdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.wujunwen.elasticearchdemo")
public class ElasticConfig {

}

